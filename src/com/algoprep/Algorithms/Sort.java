package com.algoprep.Algorithms;

public class Sort {
    /**
     * Partitioning
     * Partitioning is the process of reordering elements so all elements less than the pivot are to the left of the
     * pivot and greater items are to the right. This can be performed recursively, so O(log(n))
     * Process:
     * The partition step guarantees all elements ot the left of the midpoint are smaller than the pivot and all to
     * the right are larger. This is a prerequisite to our ability to recurse the sort
     */

    public static int[] quicksort(int[] numbers, int start, int end) {
        // boundary condition
        if (start < end) {
            int p = partion(numbers, start, end);
            // less than pivot
            quicksort(numbers, start, p-1);
            // greater than pivot
            quicksort(numbers, p + 1, end);
        }
        return numbers;
    }

    public static int partion(int[] numbers, int start, int end) {
        // last element
        int pivot = numbers[end];
        int x = start - 1;
        for (int i = start; i < end; i++) {
            if(numbers[i] < pivot) {
                /** x gets incremented only when the number is smaller than the pivot. If the number is smaller
                 * than the pivot, we know it is already in its final position for this partition run
                 */
                x++;
                swap(numbers, x, i);
            }
        }
        // Swap pivot with where x pointer ended up +1
        swap(numbers, x+1, end);
        // Return idx of pivot in partitoned array
        return x + 1;
    }

    private static void swap(int[] numbers, int x, int i){
        int temp = numbers[x];
        numbers[x] = numbers[i];
        numbers[i] = temp;
    }
}
