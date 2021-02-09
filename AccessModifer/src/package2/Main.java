package package2;

import com.putra.accessmodifer.package1.KelasA;

public class Main {
    public static void main(String[] args) {

        kelasA kelasA = new KelasA();

        System.out.println(kelasA.functionB);

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}
