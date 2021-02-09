package com.putra.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilai = 80;
        char nilaiUjian = 0;

        if (nilai >= 90){
            nilaiUjian = 'A';
        }else if(nilai >= 80){
            nilaiUjian = 'B';
        }else if(nilai >= 70){
            nilaiUjian = 'C';
        }else if(nilai >= 60){
            nilaiUjian = 'D';
        }else if(nilai <= 50){
            nilaiUjian = 'E';
        }
        System.out.println("nilai ipk anda adalah " + nilaiUjian);
    }
}
