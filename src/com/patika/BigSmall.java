package com.patika;

import java.util.Arrays;
import java.util.Scanner;

public class BigSmall {
    public static void main(String[] args) {
        int[] arr={54,6,21,65,4,2,16,84,3,24,26,8,1,32};
        Scanner input= new Scanner(System.in);
        System.out.println("bir sayı gir");
        int a= input.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<a && arr[i+1]>a){
                System.out.println(a+ " Sayısından küçük "+ arr[i]+"\n"+a+" Sayısından büyük "+arr[i+1]);
                break;
            }
            if(arr[i]==a){
                System.out.println("Girdiğiniz sayı dizinin "+ (i+1)+ ". elemanına eşit");
                break;
            } else {
                if (a<arr[0]){
                    System.out.println("girdiğiniz sayı dizideki en küçük elemandan daha küçük");
                    break;
                }
                if (a>arr[arr.length-1]){
                    System.out.println("girdiğiniz sayı dizideki en büyük elemandan daha büyük");
                    break;
                }

            }
        }
    }
}
