package com.patika;

import java.util.Scanner;

public class RCDesen {
    static void desen(int a, boolean b, int s){
        System.out.print(a+" ");
        if (a>0 && b) {  //b boolean değeri true ise +5 ekleme yapıyor false ise -5 çıkarıyor
            s++;    //sayıya 5 ekledikçe artıyor 5 azalttıkça azalıyor değeri 0 oluca başlangıç-
            a=a-5;  //değerine geldiğini anlıyor ve ilemi sonlandırıyor
            desen(a,true,s);
        } else if (a<=0 || !b){
            s--;
            if (s>=0){
                a=a+5;
                b=false;
                desen(a,b,s);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        desen(a,true,0);
    }
}
/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16
N Sayısı : 10
Çıktısı : 10 5 0 5 10
 */