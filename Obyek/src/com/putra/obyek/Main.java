package com.putra.obyek;

public class Main {
    public static void main(String[] args) {
       Hewan Elang = new Hewan("Elang");
       Hewan Kucing = new Hewan("Kucing");

       Elang.beratHewan(5);
       Elang.jumlahKakiHewan(2);
       Elang.cetakHewan();

       Kucing.beratHewan(100);
       Kucing.jumlahKakiHewan(4);
       Kucing.cetakHewan();
    }
}