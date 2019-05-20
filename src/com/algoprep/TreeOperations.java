package com.algoprep;

import com.algoprep.Entities.Node;

public class TreeOperations {

    public static void preOrderTraversal(Node root) {
        /**
         * Print Node
         * if left exists print and continue left as long as possible
         * once left is null print right if exists and go left as long as possible
         * work back up call stack this way
         * Pattern: Print, Left, Right PLR
         *
         */
        System.out.print(root.data + " ");
        if(root.left != null){
            preOrderTraversal(root.left);
        }
        if(root.right != null){
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Node root) {
        /**
         *
         * Left if not null
         * Right if not null
         * Print
         * So print the leftmost Node first, then that level's right of that, then parent, up the tree
         *
         * Pattern: Left, Right, Print LRP
         */
        if(root.left != null) {
            postOrderTraversal(root.left);
        }
        if(root.right != null) {
            postOrderTraversal(root.right);
        }
        System.out.print(root.data + " ");
    }

    public static void inOrderTraversal(Node root) {
        /**
         *
         *
         *  Try to recurse left, once left null print, recurse right
         *  This ends up printing a balanced tree from lowest to highest
         *  Pattern: Left, Print, Right LPR
         *
         */
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void reverseBinaryTree(Node root) {

    }
}
