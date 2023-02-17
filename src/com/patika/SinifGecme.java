package com.patika;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        boolean kontrol=false;
        System.out.println("Selam\nMetemetik, Türkçe, fizik, Kimya, Biyoloji ve müzik\nnot ortalamanızı ve sınıfı geçip gecmediğinizi hesaplarım");
        System.out.println("Matematik notunu giriniz");
        short mat=girdi.nextByte();
        do {
            if (mat < 0 || mat > 100) {
                System.out.println("gecersiz not girişi");
                System.out.println("Matematik notunu tekrar giriniz");
                mat = girdi.nextShort();
                kontrol=true;
            } else {
                kontrol=false;
            }
        } while(kontrol);
        kontrol=false;

        System.out.println("Türkçe notunu giriniz");
        short turk=girdi.nextShort();
        do {
            if (turk < 0 || turk > 100) {
                System.out.println("gecersiz not girişi");
                System.out.println("Turkçe notunu tekrar giriniz");
                turk = girdi.nextShort();
                kontrol=true;
            } else {
                kontrol=false;
            }
        } while(kontrol);
        kontrol=false;

        System.out.println("Fizik notunu giriniz");
        short fiz=girdi.nextShort();
        do {
            if (fiz < 0 || fiz > 100) {
                System.out.println("gecersiz not girişi");
                System.out.println("Fizik notunu tekrar giriniz");
                fiz = girdi.nextShort();
                kontrol=true;
            } else {
                kontrol=false;
            }
        } while(kontrol);
        kontrol=false;

        System.out.println("Kimya notunu giriniz");
        short kim=girdi.nextShort();
        do {
            if (kim < 0 || kim > 100) {
                System.out.println("gecersiz not girişi");
                System.out.println("Kimya notunu tekrar giriniz");
                kim = girdi.nextShort();
                kontrol=true;
            } else {
                kontrol=false;
            }
        } while(kontrol);
        kontrol=false;

        System.out.println("Biyoloji notunu giriniz");
        short biy=girdi.nextByte();
        do {
            if (biy < 0 || biy > 100) {
                System.out.println("gecersiz not girişi");
                System.out.println("Biyoloji notunu tekrar giriniz");
                biy = girdi.nextShort();
                kontrol=true;
            } else {
                kontrol=false;
            }
        } while(kontrol);
        kontrol=false;

        System.out.println("Müzik notunu giriniz");
        short muzik=girdi.nextByte();
        do {
            if (muzik < 0 || muzik > 100) {
                System.out.println("gecersiz not girişi");
                System.out.println("Müzik notunu tekrar giriniz");
                muzik = girdi.nextShort();
                kontrol=true;
            } else {
                kontrol=false;
            }
        } while(kontrol);


        int ortalama= (turk+mat+fiz+kim+biy+muzik)/6;
        System.out.println("ortalamanız ="+ortalama);
        if (ortalama<55){
            System.out.println("malesef sınıfta kaldınız");
        } else System.out.println("Tebrikler sınıfı gectiniz");

    }
}
