package com.patika;
import java.util.Scanner;

public class Kuvvet2 {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        long sayi, y=1, z=1;
        boolean sayac=true;
        sayi=girdi.nextLong();
        for (long x=1;x<=sayi;x*=2){
            System.out.println(x);
        }
        do {
            z*=4;
            if(z<=sayi) System.out.println(z);

            if (z>=sayi) sayac=false;
        }while (sayac);
        sayac=true;
        while (sayac){
            y*=5;
            if(y<=sayi)System.out.println(y);

            if (y>=sayi) sayac=false;
        }
    }
}
