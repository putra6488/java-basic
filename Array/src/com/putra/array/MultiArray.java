package com.putra.array;

public class MultiArray {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        //opsi 1 = dimensi 1, indeks 0, pangjagn elemen 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        //opsi 2 = dimensi 1, indeks 1, panjang elemen 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';

        //tampilkan opsi 1
        System.out.println("dimensi 1, indeks 0, dan dimensi 2, indeks 0 = " +arrChar[0][0]);
        System.out.println("dimensi 1, indeks 0, dan dimensi 2, indeks 1 = " +arrChar[0][1]);

        //tampilkan opsi 2
        System.out.println("dimensi 1, indeks 1, dan dimensi 2, indeks 0 = " +arrChar[1][0]);
        System.out.println("dimensi 1, indeks 1, dan dimensi 2, indeks 1 = " +arrChar[1][1]);
        System.out.println("dimensi 1, indeks 1, dan dimensi 2, indeks 2 = " +arrChar[1][2]);
    }
}
