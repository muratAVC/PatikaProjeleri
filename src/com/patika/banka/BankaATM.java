package com.patika.banka;

import java.util.Scanner;
public class BankaATM {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        byte sayac=0;
        String sifre,sifre1,kullaniciadi,kullaniciadi1,degisme,kullaniciadiyeni,sifreyeni;
        sifre1="pat123";
        kullaniciadi1="patika";
        double bakiye=1500.0, yatirilan;
        int tercih;
        boolean cikis=true;

        do{
            System.out.println("Lütfen kullanıcı adınızı giriniz");
            kullaniciadi=girdi.nextLine();
            System.out.println("Fütfen şifrenizi giriniz");
            sifre=girdi.nextLine();
            if(kullaniciadi.equals(kullaniciadi1) && sifre.equals(sifre1)){
                sayac=4;
                System.out.println("Bank Patika'ya hoşgeldiniz");
                do {
                    do {
                        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz" +
                                "\n1-->Para Yatırma" +
                                "\n2-->Para Çekme" +
                                "\n3-->Bakiye Öğrenme" +
                                "\n4-->Çıkıç yap");
                        System.out.print("İşleminiz --> ");
                        tercih=girdi.nextInt();
                        if(tercih>4 || tercih<=0){
                            System.out.println("Yanlış giriş yaptınız");

                        }
                    }while (tercih>4 || tercih<=0);



                    switch (tercih) {
                        case 1: {
                            System.out.println("Yatırmak istediğiniz tutarı giriniz");
                            yatirilan = girdi.nextDouble();
                            bakiye += yatirilan;
                            System.out.println("Bakiyeniz = "+bakiye);
                            System.out.println("Tekrar işlem yapmak istiyormusunuz =\n" +
                                    "Hayır--> 1\n" +
                                    "Evet --> 2");
                            if(girdi.nextByte()==1) cikis=false;
                            break;
                        }
                        case 2: {
                            System.out.println("Çekmek istediğiniz tutarı giriniz");
                            yatirilan = girdi.nextDouble();
                            if( yatirilan>bakiye){
                                System.out.println("Bakiyeniz yetersiz Bu işlemi yapamazsınız");
                            }else {
                                bakiye -= yatirilan;
                            }

                            System.out.println("Bakiyeniz = "+bakiye);
                            System.out.println("Tekrar işlem yapmak istiyormusunuz =\n" +
                                    "Hayır--> 1\n" +
                                    "Evet --> 2");
                            if(girdi.nextByte()==1) cikis=false;
                            break;
                        }
                        case 3: {
                            System.out.println("Hesap Bakiyeniz =" + bakiye);
                            System.out.println("Tekrar işlem yapmak istiyormusunuz =\n" +
                                    "Hayır--> 1\n" +
                                    "Evet --> 2");
                            if(girdi.nextByte()==1) cikis=false;
                            break;
                        }
                        case 4: {
                            System.out.println("Sistemden çıktınız yine bekleriz");
                            cikis=false;
                            break;
                        }
                    }
                } while (cikis);
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
