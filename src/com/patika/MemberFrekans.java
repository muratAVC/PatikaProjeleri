package com.patika;

import java.util.Arrays;
import java.util.Scanner;

public class MemberFrekans {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sıralanacak dizi kaç elemanlı olsun");
        int value=input.nextInt();
        int[] arr=new int[value];
        for (int i = 0; i < value; i++) {
            System.out.println("Dizinin "+(i+1)+". elemanını giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println("Frekansı bulunacak sayıyı giriniz");
        int a= input.nextInt();
        a=frekans(arr,a);
        System.out.println(Arrays.toString(arr));
        System.out.println("girdiğiniz sayının frekansı -->"+a);

    }
    public static int frekans(int[] arr, int a){
        int count=0;
        for (int i: arr) {
            if (a==i) count++;
        }
        return count;
    }
}
