package com.putra.array;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);


        System.out.println(arrA[4]);
    }
}