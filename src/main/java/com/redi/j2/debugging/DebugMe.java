package com.redi.j2.debugging;

@SuppressWarnings("ALL")
public class DebugMe {

    //    You are given a string of space separated numbers, and have to return the highest and lowest number.
    public String highAndLow(String numbers) {
        String[] stringList = numbers.split(" ");

        long max = 999999999;
        long min = 0;

        for (String number : stringList) {
            int numberTemp = Integer.parseInt(number);
            if (numberTemp > max) {
                max = numberTemp;
            }
            if (numberTemp < min) {
                min = numberTemp;
            }
        }
        return max + " " + min;
    }

    // Given two integers number1 and number2, which can be positive or negative, find the sum of all the integers between and
    // including them and return it. If the two numbers are equal return number1 or number2.
    // Note: number1 and number2 are not ordered!
    public int getSum(int number1, int number2) {

        // return if numbers are equal
        if (number1 == number2) {
            return number1;
        }

        if (number2 < number1) {
            return getSum(number1, number2);
        }

        // iterate through range; add each number
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }

        return sum;
    }

    // Find the next perfect square after the one passed as a parameter. If the parameter is itself not a perfect square
    // then -1 should be returned. You may assume the parameter is non-negative.
    public double findNextSquare(long square) {
        double root = Math.sqrt(square);

        if (root % 1 == 0) {
            return ++root * ++root;
        } else {
            return -1;
        }

    }
}
