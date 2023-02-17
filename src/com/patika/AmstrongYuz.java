package com.patika;

public class AmstrongYuz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            int sayi= i;
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
            System.out.println(i+" Sayısının basamak adedi="+basamakadedi);
            /// Bulduğu basamakların üssünü alıyor

            kontrol=true;
            int sayibasamak, araSayi, kalansayi;
            do {
                sayibasamak=sayiB%10;//girilen sayının son basamak değerini buluyor
                if(sayibasamak!=0) {
                    araSayi = sayibasamak;
                    sayiA = sayibasamak;
                    for (int x = 1; x < basamakadedi; x++) {//basamak değerinin üssünü alıyor
                        araSayi = araSayi * sayiA;
                    }
                    toplam = toplam + araSayi;
                }
                sayiB=sayiB/10;
                if (sayiB==0) kontrol=false;
            }while (kontrol);
            System.out.print(i+" Sayısının basamak değerlerinin kuvvet toplamı=");
            System.out.println(toplam);
            if(toplam==sayi){
                System.out.println(i+" Sayısı bir Amstrong Sayısı");
            } else {
                System.out.println(i+" Sayisı Amstrong Sayısı değil");
            }
        }
    }
}
