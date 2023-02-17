package com.patika;

import java.util.Scanner;

public class Palindrom {
    static int countt(int a){
        boolean control=true;
        int count=0;
        do {
            a = a / 10;
            if (a == 0) control = false;
            count++;
        } while (control);
        return count;
    }
    static int reverse(int num1, int count){
        int reverse,a ;
        a = num1 % 10;//son basamagı alır
        num1 = num1 / 10;//son basamak hariç geri kalanı atar
        reverse = a * 10;//son basamagı 10 ile çarpar
        for (int i = 1; i < count; i++) {
            a = num1 % 10;
            num1 = num1 / 10;
            reverse = reverse + a;
            if (i != count - 1) reverse = reverse * 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num1= girdi.nextInt();
        if (num1>9) {
            int num2 = num1;
            int count = 0;
            boolean control = true;
            int a, b, reverse;
            b = num1;

            count=countt(num1);

            /*
            a = num1 % 10;//son basamagı alır
            num1 = num1 / 10;//son basamak hariç geri kalanı atar
            reverse = a * 10;//son basamagı 10 ile çarpar
            for (int i = 1; i < count; i++) {
                a = num1 % 10;
                num1 = num1 / 10;
                reverse = reverse + a;
                if (i != count - 1) reverse = reverse * 10;
            }
            */
            if (num2 == reverse(num1,count)) System.out.println("girdiğiniz sayi bir palinrom dur");
            else System.out.println("Girdiğiniz sayı palindrom değildir");
            // System.out.println("girdiğin sayı "+count+" basamaklı");
        } else {
            System.out.println("Girdiğiniz sayı palindromdur");
        }






/*
Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
    }
}
