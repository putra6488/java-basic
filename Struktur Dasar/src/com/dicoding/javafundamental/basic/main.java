package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.musik.gitar;
import kendaraan.bajaj;
import kendaraan.mobil;
import kendaraan.motor;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        gitar.bunyi();
        mobil.jumlahBan();
        motor.jumlahBan();
        bajaj.jumlahBan();

        Date today = new Date();
        System.out.println("hari ini = " + today);

        Date tommorow = DateUtils.addDays(today, 1);
        System.out.println("besok = " + tommorow);
    }
}
