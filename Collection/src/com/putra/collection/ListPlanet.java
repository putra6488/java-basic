package com.putra.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {

        //deklarasi arrya
        String[] heroes = new String[2];
        heroes[0] = "jadul";
        heroes[1] = "update";

        //menggunakan arraylist
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("jupiter");
        planets.add("mars");

        System.out.println("List planet awal");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index " + i + " = " +planets.get(i));
        }

        planets.remove("mars");

        System.out.println("List planet akhir");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index " + i + " = " + planets.get(i));
        }
    }
}
