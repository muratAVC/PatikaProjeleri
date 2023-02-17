package com.patika;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Girdiğin Sayiları küçükten büyüğe sıralayan program\nŞimdilik 3 adet sayı girişi Yapınız");
        long sayi1,sayi2,sayi3,arasayi;
        System.out.println("lütfen 1. sayiyi giriniz");
        sayi1= girdi.nextLong();
        System.out.println("lütfen 2. sayiyi giriniz");
        sayi2= girdi.nextLong();
        System.out.println("lütfen 3. sayiyi giriniz");
        sayi3= girdi.nextLong();

        if(sayi2<sayi1){
            arasayi=sayi1;
            sayi1=sayi2;
            sayi2=arasayi;
        }
        if(sayi3<sayi2 ) {
            arasayi = sayi2;
            sayi2 = sayi3;
            sayi3 = arasayi;
        }
        if(sayi2<sayi1){
            arasayi=sayi1;
            sayi1=sayi2;
            sayi2=arasayi;
        }

        System.out.println("Sayilarin sırali hali");
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
    }
}
