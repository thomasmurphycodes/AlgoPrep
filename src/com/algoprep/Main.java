package com.algoprep;

import com.algoprep.Algorithms.DynamicProgramming;
import com.algoprep.Algorithms.Greedy;
import com.algoprep.Algorithms.Search;
import com.algoprep.Algorithms.Sort;
import com.algoprep.Bootstraps.*;
import com.algoprep.Entities.Activity;
import com.algoprep.Entities.HuffmanNode;
import com.algoprep.Entities.LinkedListNode;
import com.algoprep.Entities.Node;

import java.util.Arrays;
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
//        Integer maxTheft = DynamicProgramming.calculateMaximumKnapsackValue(
//                DynamicProgrammingBootstrap.bootstrapKnapsackProblem(), 4);
//        System.out.println("Maximum Value is: " + maxTheft);
//        System.out.println(Arrays.toString(Sort.quicksort(BootstrapSort.partionQuicksort(), 0 ,
//                BootstrapSort.partionQuicksort().length - 1)));
//        System.out.println(Recursion.lowestCommonDenominator(Arrays.asList(12, 18, 30)));
        System.out.println(Search.binarySearch(BootstrapSearch.bootstrapBinarySearch(), 9));

    }
}
