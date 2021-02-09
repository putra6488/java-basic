package com.putra.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            //mencoba membaca file
            File file = new File ("D://namafile.txt");
            FileReader fr = new FileReader(file);
            System.out.println("Read file berhasil");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
