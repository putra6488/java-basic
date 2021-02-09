package com.putra.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList();
        lo.add("lo - STRING 1");
        lo.add(new Planet("Mercury", 0.06));

        for (Object o : lo){
            Planet p = (Planet) o;
            p.print();
        }

        List<Planet> lp = new ArrayList();
        lp.add(new Planet("Mercury", 0.06));
        lp.add(new Planet("Venus", 0.82));

        for (Planet p : lp){
            p.print();
        }
    }

}
