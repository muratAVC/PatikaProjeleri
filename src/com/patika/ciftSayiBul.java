package com.patika;

import java.util.Scanner;

public class ciftSayiBul {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Bir Sayı giriniz");
        long sayi=1;
        sayi=girdi.nextLong();
        long x=0;// bu blok for döngüsüyle çift sayı buluyor
        for(long i=0;i<=sayi;i++){
            x=i%2;
            if(x==0) {
                System.out.println(i);
            }
        }
        long y=0;// bu blok  while döngüsüyle çift sayı buluyor
        while(y<=sayi){
            if (y%2==0){
                System.out.println(y);
            }
            y++;
        }

        long z=0;// bu blok do while döngüsüyle çift sayı buluyor
        do{
            if (z%2==0){
                System.out.println(z);
            }
            z++;
        }while (z<=sayi);


        double toplam=0;
        x=0;
        for(long i=1;i<=sayi;i++){
            if(((i%3)==0)||((i%4)==0)){
                toplam=toplam+i;
                x++;
            }
        }
        System.out.println("girdiğiniz sayının 3 ve 4 e bölünen alt sayılarının ortalaması");
        System.out.println(toplam/x);
    }
}
