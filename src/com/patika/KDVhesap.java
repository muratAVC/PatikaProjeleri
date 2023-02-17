package com.patika;

import java.util.Scanner;

public class KDVhesap {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        double mal, kdvliMal18, kdvliMal08, kdvSi18, kdvSi08;
        boolean kdvOrani=true;

        System.out.println("selam \nKdv'si hesaplanacak malin ucreti nedir");
        mal=girdi.nextDouble();

        kdvSi18=mal*0.18;
        kdvliMal18=kdvSi18 + mal;
        kdvSi08=mal*0.08;
        kdvliMal08=kdvSi08 + mal;

        System.out.println(mal<=1000 ? ("Malinizin KDV'li Fiyat " + kdvliMal18 + "\nKDV tutar " + kdvSi18) :("Malnzn KDV li Fiyat "+kdvliMal08+ "\nKDV tutar " + kdvSi08) );

    }
}
