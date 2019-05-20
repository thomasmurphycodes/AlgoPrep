package com.algoprep;

import com.algoprep.Entities.LinkedListNode;
import com.algoprep.Entities.Node;

public class Recursion {
    /** Recursion consists of a repeated function call with shifting arguments, building up a stack.
     * It requires an ending condition to return a result and prevent infinite recursion
     *
     */
    public static Integer factorial(int factor) {
        if (factor < 0) { return 0;}
        if (factor == 1) { return 1;}
        return factor * factorial(factor-1);
    }

    public static Integer greatestCommonFactor(int inputOne, int inputTwo) {
        // Use Modulo to quickly reach greatest common factor,
        // Once modulo is 0, it's a clean factor, so stop
        // i.e. 90, 20
        // 90 % 20 = 10
        // 20 % 10 = 0
        // so 10!
        if(inputTwo == 0) {
            return inputOne;
        }
        return greatestCommonFactor(inputTwo, inputOne%inputTwo);
    }

    public static Integer fibonacciSequence(int sequenceNumber) {
        if(sequenceNumber == 0 || sequenceNumber == 1){
            return 1;
        }
        return fibonacciSequence(sequenceNumber - 1) + fibonacciSequence(sequenceNumber - 2);
    }

    public static void reverseLinkedList(LinkedListNode element) {
        if(element.next != null){
            reverseLinkedList(element.next);
        }
        System.out.print(element.data + " ");

    }

    // TODO Towers of Hanoi: https://learning.oreilly.com/library/view/advanced-topics-in/9781430266198/9781430266198_Ch05.xhtml

}
