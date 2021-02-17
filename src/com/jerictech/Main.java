package com.jerictech;

//Wrapper classes allow operations with a primitive

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Int minimum value = " + myMinIntValue);
        System.out.println("Int maximum value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted min value = " + (myMinIntValue - 1)); // underflow


    }
}
