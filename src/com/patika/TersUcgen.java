package com.patika;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Ters üçgenin büyüklüğünü giriniz");
        int boyut= girdi.nextInt();
        boyut++;
        int a=1;
        for (int x = 1; x <= boyut; x++) {
            for (int k = 0; k < x-1; k++) {
                System.out.print(" ");
            }
            for (int i = 2; i <2*boyut-a ; i++) {
                System.out.print("*");
            }
            a=a+2;
            System.out.println(" ");
        }

    }
}
