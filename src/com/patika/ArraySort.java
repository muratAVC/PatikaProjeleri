package com.patika;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static int[] sortt(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    a=arr[j];
                    arr[j]=arr[i];
                    arr[i]=a;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sıralanacak dizi kaç elemanlı olsun");
        int value=input.nextInt();
        int[] arr=new int[value];
        for (int i = 0; i < value; i++) {
            System.out.println("Dizinin "+(i+1)+". elemanını giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr)+"-");

        arr=sortt(arr);
        System.out.println(Arrays.toString(arr));

    }
}
