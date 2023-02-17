package com.patika;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double dik1,dik2,hipotenus,alan,u;
        System.out.println("selam \ngenin dik kenarlarnn lcsn girersen\nSana Hipotens ve Alann hesaplarm");
        System.out.println("1 Dik kenar gir");
        dik1= girdi.nextDouble();
        System.out.println("2 Dik kenar gir");
        dik2= girdi.nextDouble();
        hipotenus= dik1*dik1+dik2*dik2;
        hipotenus=Math.sqrt(hipotenus);
        System.out.print("genin hipotens deeri\n");

        System.out.println(hipotenus);
        u=(dik1+dik2+hipotenus)/2;
        alan=Math.sqrt(u*(u-dik1)*(u-dik2)*(u-hipotenus));
        System.out.println("cgenin alan");
        System.out.println(alan);
    }
}
