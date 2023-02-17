package com.patika;

import java.util.Scanner;

public class HarmonikDizi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Harmonik dizisi hesaplanacak sayiyi giriniz");
        int dizi=girdi.nextInt();

        double toplam=0.0;
        for (double i = 1; i <= dizi ; i++) {
            toplam+=(1.0/i);
        }

        System.out.println(toplam);
    }
}
