package com.patika;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Bir Sayı giriniz");
        int sayi= girdi.nextInt();
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0) toplam+=i;

        }
        if (toplam==sayi) System.out.println("Girdiğiniz sayi mükemmel bir sayı");
        else System.out.println("Girdiğiniz sayı mükemmel değil malesef");
    }
}
