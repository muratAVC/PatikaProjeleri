package com.patika;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        byte sayac=0;
        String sifre,sifre1,kullaniciadi,kullaniciadi1,degisme,kullaniciadiyeni,sifreyeni;
        sifre1="pat123";
        kullaniciadi1="patika";

        do{
            System.out.println("Lütfen kullanıcı adınızı giriniz");
            kullaniciadi=girdi.nextLine();
            System.out.println("Fütfen şifrenizi giriniz");
            sifre=girdi.nextLine();
            if(kullaniciadi.equals(kullaniciadi1) && sifre.equals(sifre1)){
                System.out.println("Tebrikler Sisteme giriş yaptınız");
                sayac=4;
            } else {
                System.out.println("Kullanıcı adı veya şifreyi yanlış girdiniz\nTekrar deneyiniz");
                sayac++;
            }

        } while(sayac<3);
        if(sayac==3){
            System.out.println("Kullanıcı adınızı ve şifrenizi sıfırlamak istermisiniz\nEvet ile 'Y' Hayır ise 'N' giriniz");
            degisme=girdi.nextLine();
            if(degisme.equals("Y")){
                boolean kontrol=false;
                do {
                    System.out.println("Lütfen yeni kullanıci adınızı giriniz");
                    kullaniciadiyeni=girdi.nextLine();
                    System.out.println("Lütfen yeni şifrenizi giriniz");
                    sifreyeni=girdi.nextLine();
                    if (kullaniciadiyeni.equals(kullaniciadi1) && sifreyeni.equals(sifre1)){
                        System.out.println("Lütfen eski kullanıcı adından ve şifrenizden başka bir giriş yapınız");
                        kontrol=true;
                    } else {
                        kullaniciadi1=kullaniciadiyeni;
                        sifre1=sifreyeni;
                        System.out.println("Kullanıcı adınız ve şifreniz başarılı bir şekilde değişti");
                    }
                } while(kontrol);
            }
        }

    }
}
