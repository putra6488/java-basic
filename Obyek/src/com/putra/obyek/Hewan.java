package com.putra.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

    //ini constructor = obyek yang pertama kali dijalankan
    public Hewan(String namaHewan){
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan){
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("nama hewan = " +nama);
        System.out.println("berat hewan = " +berat+ "kg");
        System.out.println("jumlah kaki = " +jumlahKaki);
    }


}
