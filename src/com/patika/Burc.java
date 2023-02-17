package com.patika;

import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Doğum tarihine göre burç bulucu\nLütfen Doğum tarihini Gün/ay/yıl formatinda giriniz");
        String dogumtarihi,gecici;
        byte gun, ay;
        dogumtarihi=girdi.nextLine();
        gecici=dogumtarihi.substring(0,2);
        gun= Byte.parseByte(gecici);
        ay= Byte.parseByte(dogumtarihi.substring(3,5));
        // System.out.println(gun+"  "+ay);
        /*
        switch (ay){
            case 1: {
                if(gun>=22) System.out.println("burcunuz Kova"); else System.out.println("burcunuz Oğlak");
                break;
            }
            case 2: {
                if(gun>=20) System.out.println("burcunuz Balık"); else System.out.println("burcunuz Kova");
                break;
            }
            case 3: {
                if(gun>=21) System.out.println("burcunuz Koç"); else System.out.println("burcunuz Balık");
                break;
            }
            case 4: {
                if(gun>=21) System.out.println("burcunuz Boğa"); else System.out.println("Burcunuz Koç");
                break;
            }
            case 5: {
                if(gun>=22) System.out.println("burcunuz İkizler"); else System.out.println("Burcunuz Boğa");
                break;
            }
            case 6: {
                if(gun>=23) System.out.println("burcunuz Yengeç"); else System.out.println("burcunuz İkizler");
                break;
            }
            case 7: {
                if(gun>=23) System.out.println("burcunuz Aslan"); else System.out.println("Burcunuz Yengeç");
                break;
            }
            case 8: {
                if(gun>=23) System.out.println("burcunuz Başak"); else System.out.println("Burcunuz Aslan");
                break;
            }
            case 9:  {
                if(gun>=23) System.out.println("burcunuz Terazi"); else System.out.println("Burcunuz Başak");
                break;
            }
            case 10: {
                if(gun>=23) System.out.println("burcunuz Akrep"); else System.out.println("Burcunuz Terazi");
                break;
            }
            case 11: {
                if(gun>=22) System.out.println("burcunuz Yay"); else System.out.println("Burcunuz Akrep");
                break;
            }
            case 12: {
                if(gun>=22) System.out.println("burcunuz Oğlak"); else System.out.println("Burcunuz Yay");
                break;
            }
        }
        */

        if(ay==1)
            if(gun>=22) System.out.println("Burcunuz Kova"); else System.out.println("Burcunuz Oğlak");
        if(ay==2)
            if(gun>=20) System.out.println("Burcunuz Balık"); else System.out.println("Burcunuz Kova");
        if(ay==3)
            if(gun>=21) System.out.println("Burcunuz Koç"); else System.out.println("Burcunuz Balık");
        if(ay==4)
            if(gun>=21) System.out.println("Burcunuz Boğa"); else System.out.println("Burcunuz Koç");
        if(ay==5)
            if(gun>=22) System.out.println("Burcunuz İkizler"); else System.out.println("Burcunuz Boğa");
        if(ay==6)
            if(gun>=23) System.out.println("Burcunuz Yengeç"); else System.out.println("Burcunuz İkizler");
        if(ay==7)
            if(gun>=23) System.out.println("Burcunuz Aslan"); else System.out.println("Burcunuz Yengeç");
        if(ay==8)
            if(gun>=23) System.out.println("Burcunuz Başak"); else System.out.println("Burcunuz Aslan");
        if(ay==9)
            if(gun>=23) System.out.println("Burcunuz Terazi"); else System.out.println("Burcunuz Başak");
        if(ay==10)
            if(gun>=23) System.out.println("Burcunuz Akrep"); else System.out.println("Burcunuz Terazi");
        if(ay==11)
            if(gun>=22) System.out.println("Burcunuz Yay"); else System.out.println("Burcunuz Akrep");
        if(ay==12)
            if(gun>=22) System.out.println("Burcunuz Oğlak"); else System.out.println("Burcunuz Yay");

    }
}
