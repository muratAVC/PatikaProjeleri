package com.patika;

public class ArrHarrOrt {
    static double harmonik(double dizi){
        double toplam=0.0;
        for (double i = 1; i <= dizi ; i++) {
            toplam+=(1.0/i);
        }
        return toplam;
    }
    public static void main(String[] args) {
        double[] arr ={2,5,9,51,84,32,846,45,21,58,31,68,45};
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr.length/harmonik(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
