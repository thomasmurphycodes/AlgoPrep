package com.algoprep.Algorithms;

import com.algoprep.Entities.StealableItem;

import java.util.ArrayList;
import java.util.List;

public class DynamicProgramming {
    /**
     * Dynamic programming is breaking a hard problem into subproblems and solving those first
     * THIS is the goto when you have a cost function and a value function
     * i.e. $400 for 20 lbs, $200 for 12 lbs, $50 for 1 lb and $650
     * The Knapsack Problem
     * Brute force solution: try all exhaustive combinations.
     * This is SLOW, O(2^n) specifically
     *
     * Dynamic Programming construct "sub-knapsacks" first
     * This is modeled with a matrix
     * Rows are items, columns are knapsack sizes
     *
     * Fill in the value function to that items row
     * For each row in each column, this represents the "best guess" of the maximum value to steal
     * In each row, you can steal the item in the row or the item above it (subject to capacity constraint)
     * The order of rows doesn't matter - no sort is needed
     *
     * Example: [Stereo{3000, 4}, Laptop{2000, 3} Guitar{1500, 1}, iPhone{2000, 1}]
     * i.e (1 -> 1500, 4 -> 3000 1500 for capacity 1-3, 3000 for capacity 4)
     * SO: in the final row, compare options for space
     * cell[i][j] = java.lang.Math.max(previous MAX ([i-1][j], [i-1][j-cost function]))
     *
     * Adding items is an O(n) (of capacity) calculation
     *
     *
     *
     *  The max value *never goes down*. The Final row is always the optimal solution from what we've seen so far
     *
     *  Note: This approach doesn't work for fractional sizes
     *
     *
     */
    public static Integer calculateMaximumKnapsackValue(List<StealableItem> stealableItems, Integer sackSize) {
        int[][] knapsackArray = new int[stealableItems.size()][sackSize];

        for(int i = 0; i < stealableItems.size(); i++) {
            for(int j = 0; j < sackSize; j++) {
                // First row is always first value
                if(i == 0) {
                    knapsackArray[i][j] = stealableItems.get(i).value;
                    // Weight is too heavy, take previous rows value
                } else if (j - stealableItems.get(i).weight < 0) {
                    knapsackArray[i][j] = knapsackArray[i-1][j];
                } else {
                    knapsackArray[i][j] = Math.max(knapsackArray[i-1][j], stealableItems.get(i).value +
                    knapsackArray[i-1][j - stealableItems.get(i).weight]);
                }
            }
        }
        return knapsackArray[stealableItems.size()-1][sackSize-1];
    }

}
