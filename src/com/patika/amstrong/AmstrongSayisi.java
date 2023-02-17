package com.patika.amstrong;

import java.util.Scanner;

public class AmstrongSayisi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= girdi.nextInt();
        int basamakadedi=0,sayiA,sayiC,sayiB,toplam=0;
        boolean kontrol=true;
        sayiB=sayi;
        sayiC=sayi;

        // Basamak adedini buluyor
        do {
            if(sayiC/10!=0){
                basamakadedi++;
                sayiC=sayiC/10;
            } else {
                basamakadedi++;
                kontrol=false;
            }
        }while (kontrol);
        System.out.println("Girdiğiniz sayının basamak adedi="+basamakadedi);
        /// Bulduğu basamakların üssünü alıyor

        kontrol=true;
        int sayibasamak, sayifor, kalansayi;
        do {
            sayibasamak=sayiB%10;//girilen sayının son basamak değerini buluyor
            if(sayibasamak!=0) {
                sayifor = sayibasamak;
                sayiA = sayibasamak;
                for (int x = 1; x < basamakadedi; x++) {//basamak değerinin üssünü alıyor
                    sayifor = sayifor * sayiA;
                }
                toplam = toplam + sayifor;
            }
            sayiB=sayiB/10;
            if (sayiB==0) kontrol=false;
        }while (kontrol);
        System.out.print("Girdiğiniz sayının basamak değerlerinin kuvvet toplamı=");
        System.out.println(toplam);
        if(toplam==sayi){
            System.out.println("girdiğiniz sayı bir Amstrong Sayısı");
        } else {
            System.out.println("Gridiğiniz sayi Amstrong Sayısı değil");
        }
        System.out.println("............................................");
        System.out.println("Girdiğiniz sayının basamak değerleri toplamı");
        kontrol=true;
        toplam=0;
        do {
            sayibasamak=sayi%10;
            toplam=toplam+sayibasamak;
            sayi=sayi/10;
            if (sayi==0) kontrol=false;
        }while (kontrol);
        System.out.println("toplamı= "+toplam);

    }
}
