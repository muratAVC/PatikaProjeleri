package com.patika;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double kilo, boy, kitle;
        System.out.print("Vücut Kitle hesabı için kilonuzu giriniz");
        kilo=girdi.nextDouble();
        System.out.print("Vücut Kitle hesabı için boyunuzu giriniz");
        boy=girdi.nextDouble();


        kitle=kilo/(boy*boy);

        System.out.println("vcut kitle endeksiniz");
        System.out.println(kitle);

        if (kitle<20) {
            System.out.println("Kitle endeksiniz 20 nin altnda biraz kilo aln");
        }
        else if (kitle>25) {
            System.out.println("kitle endeksiniz 25 nin stnde biraz kilo verin");

        }else {
            if(kitle>24 & kitle<25 ) {
                System.out.println("tebrikler mkemmel kilodasnz ama biraz daha yerseniz obez olursunuz)");

            } else if(kitle>20 & kitle<21){
                System.out.println("biraz daha kilo verirseniz kemikleriniz grnecek :)");
            } else {
                System.out.println("tebrikler mkemmel kilodasnz :))");

            }
        }
    }
}
