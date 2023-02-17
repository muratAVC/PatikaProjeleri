package com.patika;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double carpan=2.20, km,ucret, acilis=10;
        boolean kontrol;
        System.out.println("Selam\nmusteriyi kac km tasidiniz");
        km=girdi.nextDouble();

        ucret=acilis+km*carpan;
        kontrol=ucret<20;
        System.out.println(kontrol ? ("Toplam Tasima ucreti  ="+ 20 +"TL"):("Toplam Tasima ucreti  =" + ucret + "TL"));

    }
}
