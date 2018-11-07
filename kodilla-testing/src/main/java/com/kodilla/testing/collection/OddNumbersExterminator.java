
package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public ArrayList<Integer> exterminateNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}


