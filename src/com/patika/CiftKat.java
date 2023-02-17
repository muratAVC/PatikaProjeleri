package com.patika;

import java.util.Scanner;

public class CiftKat {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        long sayi=0, ttoplam=0;
        boolean kontrol=true;
        /*
        do{
            System.out.print("Bir Sayı giriniz:");
            sayi=girdi.nextLong();
            if(sayi>=0){
                if(sayi%2!=0){
                    ttoplam=ttoplam+sayi;
                }
            }else{
                kontrol=false;
            }
        }while(kontrol);
        System.out.println("girdiğin sayilardan tek olanların toplamı ="+ttoplam);
        */
        do{System.out.print("Bir Sayı giriniz:");
            sayi=girdi.nextLong();

            if(sayi%2==0){
                if(sayi%4==0){
                    ttoplam=ttoplam+sayi;
                }
            }else{
                kontrol=false;
            }
        }while (kontrol);
        System.out.println("girdiğin sayilardan çift ve 4'e bölünenlerin toplamı toplamı ="+ttoplam);

    }
}
