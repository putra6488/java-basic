package com.putra.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        int T;

        System.out.println("Contoh If tiga kasus");
        System.out.println("Suhu (der. C) = ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        //pengecekan dengan if
        if (T < 0){
            System.out.println("Wujud air beku = " + T);
        }else if ((0 <= T) && (T <= 100)){
            System.out.println("Wujud air cair= " + T);
        }else if (T > 100){
            System.out.println("Wujud uap/gas");
        }
    }
}
