package com.patika;

import java.util.Arrays;

public class ArrayAgainNum {
    public static void main(String[] args) {
        int[] arr={2,5,15,62,5,21,4,52,35,2,3,51,3,25,12,2,2,21,3,2,12,5,3,52,3,32,3,21,5,35,53,6,5,4,0,5,0,15,5,6,9};
        int[] arr1 = new int[arr.length];
        System.out.println(arr.length);
        Arrays.fill(arr1,0);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]%2==0){
                    if (arr[i]==arr[j]){
                        arr1[count]=arr[i];
                    }
                } else {
                    // count++;
                }
            }
            count++;
        }

        System.out.println(Arrays.toString(arr1));
    }
}
