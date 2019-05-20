package com.algoprep.Entities;

public class Node {
    public String data;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
    }

    public Node(String data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
