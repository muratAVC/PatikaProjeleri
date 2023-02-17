package com.patika;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Girdiğin iki sayıdan 1. sayının üssünü 2. sayıya göre alırım");
        int sayiA, sayiB,sayac=1;
        int sayi, sayifor;
        System.out.println("1. sayiyi gir");
        sayiA= girdi.nextInt();
        System.out.println("2. sayiyi gir");
        sayiB= girdi.nextInt();
        sayi=sayiA;
        while (sayac<sayiB){
            sayi=sayi*sayiA;
            sayac++;
        }
        System.out.println(sayi);

        sayifor=sayiA;
        for (int x=1;x<sayiB;x++){
            sayifor=sayifor*sayiA;
        }
        System.out.println(sayifor);
    }
}
