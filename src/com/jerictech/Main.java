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

        int myMinByteValue = Byte.MIN_VALUE;
        int myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        int myMinShortValue = Short.MIN_VALUE;
        int myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);




    }
}
