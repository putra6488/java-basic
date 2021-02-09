package com.putra.function;

public class MethodOverLoading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("hasilnya = " +hasil);

        int a = 7;
        int b = 6;
        int hsl = hitungLuas(a, b);
        System.out.println("hasilnya = " +hsl);
    }
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas(int panjang, int lebar){
        double luas = panjang * lebar;
        return (int) luas;
    }
}
