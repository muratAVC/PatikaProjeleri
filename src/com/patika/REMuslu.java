package com.patika;

import java.util.Scanner;

public class REMuslu {
    static int kuvvet(int a, int b){
        int result=a;
        if (b==0) {
            return 1;
        } else {
            result=result*kuvvet(a,b-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz");
        int a=input.nextInt();
        System.out.println("2. Sayıyı giriniz");
        int b=input.nextInt();
        int result=kuvvet(a,b);
        System.out.println(result);
    }
}
