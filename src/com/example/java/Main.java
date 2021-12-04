package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sum = 0;
        int[] myArray = {5, 6, 7, 12, -5, 32, 43};
        for (int i : myArray) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
