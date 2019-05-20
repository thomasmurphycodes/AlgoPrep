package com.algoprep.Bootstraps;

import com.algoprep.Entities.LinkedListNode;
import com.algoprep.Entities.Node;

public class BootstrapTrees {

    public static Node bootstrapBalancedTree(){
        Node lvlThreeL = new Node("1", null, null);
        Node lvlThreeR = new Node("7", null, null);
        Node lvlTwoL = new Node("2", lvlThreeL, null);
        Node lvlTwoR = new Node("6", null, lvlThreeR);
        Node lvlOneL = new Node("3", lvlTwoL, null);
        Node lvlOneR = new Node("5", null, lvlTwoR);
        Node root = new Node("4", lvlOneL, lvlOneR);
        return root;
    }

    public static LinkedListNode bootstrapLinkedList(){
        LinkedListNode fine = new LinkedListNode("Fine", null);
        LinkedListNode she = new LinkedListNode("She", fine);
        LinkedListNode damn = new LinkedListNode("Damn", she);
        LinkedListNode nine = new LinkedListNode("9", damn);
        LinkedListNode six = new LinkedListNode("6", nine);
        LinkedListNode three = new LinkedListNode("3", six);
        return three;
    }
}
