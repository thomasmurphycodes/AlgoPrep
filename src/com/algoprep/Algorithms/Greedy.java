package com.algoprep.Algorithms;

import com.algoprep.Entities.Activity;
import com.algoprep.Entities.HuffmanNode;

import java.util.*;

public class Greedy {
    /**
     * Greedy algorithms always break down to being an *activity selection problem*
     * The goal is to find the maximum subset
     * This can be the maximum number of activities (Weight=1)
     * Or the maximum score, when activities have weights
     *
     * At each step of the algorithm, choose the next activity greedily
     * The two basic properties of all Greedy algorithms are:
     * 1) Optimal Substructure: Each subproblem exhibits the optimal structure of the main problem. Specifically,
     * each subset considered in a selection must exhibit the structure of the global problem set
     * 2) Greedy choice: From the local optimum, we can reach the global optimum, without revisiting local choices.
     * In this example: If you have the maximum size of subset and can pick something with an earlier end time
     * (Optimal Substructure), that choice is even greedier and so should be chosen
     *
      */
    public static List<Activity> selectUnweightedActivities(List<Activity> activityChoices) {
        List<Activity> sortedActivities = new ArrayList<>(activityChoices);
        List<Activity> selectedActivities = new ArrayList<>();
        // Sort activites by their digitized representation, meaning which activities finish
        // before the next one starts
        Collections.sort(sortedActivities, (o1, o2) -> Integer.signum(o1.finish - o2.finish));
        if(sortedActivities.size() > 0) {
            selectedActivities.add(sortedActivities.get(0));
        }
        // Loop through the sorted by completion time signum op activity list, and if
        // the start time of the next activity in the list is after the end time of the
        // activity currently in the selection, add it
        for (int i = 1; i < sortedActivities.size(); i++) {
            if (sortedActivities.get(i).start > selectedActivities.get(selectedActivities.size()-1).finish) {
                selectedActivities.add(sortedActivities.get(i));
            }
        }
        return selectedActivities;
    }

    // TODO debug
    public static HuffmanNode huffmanCoding(Map<String, Integer> wordFrequencies) {
        /**
         *
         * Huffman coding finds the optimal way to compress each character in a data set to a binary string.
         * First: generate the frequency of each character in the data set
         * A variable bit-length code represents information in a smaller space than a fixed-length code, so use
         * variable length.
         * i.e. a = 0, b=111, c = 101 etc.
         * The trick is to give the most frequent characters shorter(smaller) codes than less frequent characters
         * Prefix Codes: No code word is also the prefix of another code word - so above, because 0 is a,
         * all other code words must start with 1 to eliminate ambiguity
         *
         * These code words can be generated by creating a binary tree that outputs a 1 for each right taken
         * and a 0 for each left. The optimal encoding scheme has C leaves, where C = size() of alphabet
         *
         * The Huffman code starts with each leaf - joining the two least frequent nodes, until we reach the
         * root.
         *
         *
         */
        int alphabetSize = wordFrequencies.size();
        // Priority queue of the size of alphabet, priority sorted by most frequent to least frequent
        // The encoding is contained in the Queue created by the digitized representation

        // PriorityQueue(int initialCapacity, Comparator<E> comparator) version
        /**
         *
         * The PriorityQueue implementation is a heap, meaning the highest priority element (the heap root)
         * is O(1), the lowest priority is O(log(N)) (a leaf of the heap), and insert is O(log(n))
         */
        PriorityQueue<HuffmanNode> huffmanQueue = new PriorityQueue<>(alphabetSize, (o1, o2) ->
        Integer.signum(o1.frequency - o2.frequency));
        for(Map.Entry<String, Integer> entry: wordFrequencies.entrySet()) {
            HuffmanNode n = new HuffmanNode();
            n.data = entry.getKey();
            n.frequency = entry.getValue();
            huffmanQueue.add(n);
        }

        for(int i = 0; i < alphabetSize-1; i++){
            HuffmanNode n = new HuffmanNode();
            // remove() removes the least element in the priority queue, in this case remove by frequency
            n.left = huffmanQueue.remove();
            n.right = huffmanQueue.remove();
            n.frequency = n.left.frequency + n.right.frequency;
            huffmanQueue.add(n);
        }
        return huffmanQueue.remove();
    }

    // TODO debug
    public static String huffmanDecode(String encoding, HuffmanNode current, HuffmanNode code, String input) {
        if (current.data != null) {
            return huffmanDecode(encoding, code, code, input + current.data);
        }
        if (encoding.isEmpty()) {
            return input;
        }
        if (encoding.charAt(0) == '0') {
            return huffmanDecode(encoding, code, code, "");
        }
        return huffmanDecode(encoding.substring(1), current.right ,code, input);
    }
}
