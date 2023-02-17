package com.patika;

import java.util.Scanner;
public class Faktoryel {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        long n,r;
        System.out.println("Kombinasyonu hesaplanacak sayıları giriniz");
        System.out.println("1. Sayıyı gir");
        n= girdi.nextLong();
        System.out.println("2. Sayıyı gir");
        r= girdi.nextLong();
        double y=1,yn=1,yr=1,nr=1, kombi;// yn ve yr değişkenleri sırasıyla n ve r sayılarının faktoryelini tutuyor
        if (r>n){                   // nr ise n-r sayısının faktoryelini tutuyor
            System.out.println("Yanlış giriş yaptınız");
        } else {
            for (long x = 1; x <= n; x++) {
                yn = yn * x;
            }
            for (long x = 1; x <= r; x++) {
                yr = yr * x;
            }
            for (long x = 1; x <= (n - r); x++) {
                nr = nr * x;
            }
            kombi = yn / (yr * nr);
            System.out.println(kombi);
        }
        /*    Bu kısım sadece faktoryel hesaplar
        for(long x=1;x<=n;x++){
            y=y*x;
        }
        //C(n,r) = n! / (r! * (n-r)!)
        System.out.println(y); */

    }
}
