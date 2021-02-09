package com.putra.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkarang;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkarang = new Lingkaran();

        //panggil menu
        mainMenu();

        switch (pilihan){
            case '1':{
                System.out.println("Masukan persegi panjang = ");
                s1 = scanner.nextInt();
                System.out.println("Masukan lebar persegi panjang = ");
                s2 = scanner.nextInt();
                System.out.println("Luas Segtiga = " + osegitiga.luas(s1,s2));
                System.out.println("Keliling Persegi Panjang = " + opersegi.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.println("Masukan jari-jari lingkaran = ");
                s1 = scanner.nextInt();
                System.out.println("Masukan tinggi segitiga siku = ");
                s2 = scanner.nextInt();
                System.out.println("Luas Segitiga = " + olingkarang.luas(r));
                System.out.println("Keliling Lingkaran = " + olingkarang.keliling(r));
                break;
            }
            case '3':{
                System.out.println("Masukan jari-jari lingkaran = ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran = " + olingkarang.keliling(r));
                System.out.println("Keliling lingkaran = " + olingkarang.keliling(r));
                break;
            }
            default :{
                System.out.println("Tidak Ada Pilihan");
                break;
            }
        }
    }

    private static void mainMenu(){
        System.out.println("-----------");
        System.out.println("Hitung Luas dan Keliling");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
