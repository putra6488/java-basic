package com.putra.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        //menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari lalu adalah " + calendar.getTime());

        //menampilak waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 Bulan yang akan datang adalah " + calendar.getTime());

        //menampilkan 2 tahu yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun yang akan datang adalah " + calendar.getTime());
    }
}
