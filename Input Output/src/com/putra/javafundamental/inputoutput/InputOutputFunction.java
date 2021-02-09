package com.putra.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Penjumlahan");
        System.out.print("angka pertama = ");
        int nilai1 = inputUser.nextInt();
        System.out.println("Angka kedua = ");
        int nilai2 = inputUser.nextInt();
        int hasil = nilai1 + nilai2;
        System.out.println("hasilnya = " + hasil);
    }
}
