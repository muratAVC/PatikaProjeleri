package com.patika;

import java.util.Scanner;

public class Calculator {
    static int topla(int a,int b){
        return a+b;
    }
    static int takeout(int a, int b){
        return a-b;
    }
    static int impact(int a, int b){
        return a*b;
    }
    static double divide(int a, int b){
        return a/b;
    }
    static int Kuvvet(int a,int b){
        int sonuc=a;
        for (int x=1;x<b;x++){
            sonuc=sonuc*a;
        }
        return sonuc;
    }
    static long Faktor(int a){
        int b=1;
        for (int i = 1; i <=a ; i++) {
            b=b*i;
        }
        return b;
    }
    static int modd(int a, int b){
        return a%b;
    }
    static int rectangleA(int a, int b){
        return a*b;
    }
    static int rectangleC(int a, int b){
        return 2*a+2*b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean control=true;
        do {
            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";
            System.out.println(menu);
            System.out.println("lütfen işlmi seçiniz");
            int process=scan.nextInt();
            if (process<0 || process>8){
                System.out.println("gecersiz giriş yaptınız");
                control=false;
            }else {
                switch (process){
                    case 1: {
                        System.out.println("Toplama işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println(topla(a,b));
                        break;
                    }
                    case 2:{
                        System.out.println("Çıkarma işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println(takeout(a,b));
                        break;
                    }
                    case 3: {
                        System.out.println("Çarpma işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println(impact(a,b));
                        break;
                    }
                    case 4:{
                        System.out.println("Bölme işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println(divide(a,b));
                        break;
                    }
                    case 5: {
                        System.out.println("Kuvvet alma işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println(Kuvvet(a,b));
                        break;
                    }
                    case 6:{
                        System.out.println("Faktoryel işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println(Faktor(a));
                        break;
                    }
                    case 7: {
                        System.out.println("Mod alma işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println(modd(a,b));
                        break;
                    }
                    case 8:{
                        System.out.println("Dikdörtgenin Çevre ve Alan Hesabı işlemini sectiniz\nLütfen 1. sayıyı giriniz");
                        int a=scan.nextInt();
                        System.out.println("2. sayıyı giriniz");
                        int b=scan.nextInt();
                        System.out.println("Dikdörtgenin alanı = "+rectangleA(a,b));
                        System.out.println("Dikdörtgenin Çevresi = "+rectangleC(a,b));
                        break;
                    } default :{
                        System.out.println("Devam Etmek istiyormusunuz- \nEvet\nHayır");
                        String con = scan.next();
                        if (con.equals("E")){
                            control=true;
                        }else control=false;
                        break;
                    }

                }
            }
        }while (control);

    }
}
