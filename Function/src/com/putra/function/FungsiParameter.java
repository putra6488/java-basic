package com.putra.function;

public class FungsiParameter {
    public static void main(String[] args) {
        hitungLuas(7, 6.5);
    }
    public static void hitungLuas(int panjang, double lebar){
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
