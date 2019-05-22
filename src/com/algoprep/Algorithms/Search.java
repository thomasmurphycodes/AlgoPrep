package com.algoprep.Algorithms;

import com.algoprep.Entities.Card;

public class Search {

    public static int binarySearch(Card[] sortedSequence, Integer target) {
        int low = 0;
        int high = sortedSequence.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comp = Integer.valueOf(sortedSequence[mid].getRank()).compareTo(target);

            if(comp == 0){
                return mid;
            } else if (comp < 0) {
                // search in high half
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        // return position of element or -1 if not in list
        return -1;
    }
}
