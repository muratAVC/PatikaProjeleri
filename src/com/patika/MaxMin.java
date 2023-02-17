package com.patika;


import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz");
        int sayi=girdi.nextInt();
        int max=1,min=0,gecici;
        for (int i = 1; i <= sayi; i++) {
            System.out.println(i+". Sayıyı giriniz");
            gecici=girdi.nextInt();

            if (gecici>max){
                max=gecici;
            }else{
                min=gecici;
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
