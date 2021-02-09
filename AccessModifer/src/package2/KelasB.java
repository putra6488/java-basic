package com.putra.accessmodifer.package2;

import com.putra.accessmodifer.package1.KelasA;

public class KelasB {
    protected void methodC(){
        super.methodC();

        System.out.println("pemanggilan protec dari luar");
    }
}
