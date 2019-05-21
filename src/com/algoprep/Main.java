package com.algoprep;

import com.algoprep.Algorithms.DynamicProgramming;
import com.algoprep.Algorithms.Greedy;
import com.algoprep.Bootstraps.BootstrapTrees;
import com.algoprep.Bootstraps.DynamicProgrammingBootstrap;
import com.algoprep.Bootstraps.GreedyBootstrap;
import com.algoprep.Entities.Activity;
import com.algoprep.Entities.HuffmanNode;
import com.algoprep.Entities.LinkedListNode;
import com.algoprep.Entities.Node;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("GOING");
        Node bootstrappedTree = BootstrapTrees.bootstrapBalancedTree();
//        TreeOperations.preOrderTraversal(bootstrappedTree);
//        TreeOperations.postOrderTraversal(bootstrappedTree);
//        TreeOperations.inOrderTraversal(bootstrappedTree);
//        Integer factorialSix = Recursion.factorial(7);
//        System.out.println(factorialSix);
//        Integer greatestCommonFactorTest = Recursion.greatestCommonFactor(90, 20);
//        Integer fibonacciSeq = Recursion.fibonacciSequence(5);
//        LinkedListNode bootstrappedLinkedList = BootstrapTrees.bootstrapLinkedList();
//        Recursion.reverseLinkedList(bootstrappedLinkedList);
//        System.out.println(fibonacciSeq);
//        List<Activity> activityList = Greedy.selectUnweightedActivities(GreedyBootstrap.bootstrapActivities());
//        activityList.forEach(x -> System.out.print("Activity ID:" + x.id + " "));
//        HuffmanNode huffmanNode = Greedy.huffmanCoding(GreedyBootstrap.bootstrapHuffmanCoding());
        Integer maxTheft = DynamicProgramming.calculateMaximumKnapsackValue(
                DynamicProgrammingBootstrap.bootstrapKnapsackProblem(), 4);
        System.out.println("Maximum Value is: " + maxTheft);
    }
}
