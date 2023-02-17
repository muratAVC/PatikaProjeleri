package com.patika;

import java.util.Scanner;

public class RCAsal {
    static boolean asal(int a,int b){//b değeri a değerinin yarısı olmalı
        if(b==1) return true;
        else if (a%b==0 ) return false;
        else return asal(a,b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        if (asal(a,a/2)) System.out.println("asal");
        else System.out.println("asal değil");
    }
}
