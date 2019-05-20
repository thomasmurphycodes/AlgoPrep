package com.algoprep.Entities;

public class HuffmanNode extends Node {
    public Integer frequency;
    public HuffmanNode left;
    public HuffmanNode right;

    public HuffmanNode() {
    }

    public HuffmanNode(String data, Integer frequency) {
        super(data);
        this.frequency = frequency;
    }

    public HuffmanNode(String data, Node left, Node right, Integer frequency) {
        super(data, left, right);
        this.frequency = frequency;
    }

    public HuffmanNode(Integer frequency, HuffmanNode left, HuffmanNode right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    public HuffmanNode(String data, Integer frequency, HuffmanNode left, HuffmanNode right) {
        super(data);
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

}
