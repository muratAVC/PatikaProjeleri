package com.patika;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int n= girdi.nextInt();

        for (int x = n-2; x <= n; x++) {
            for (int i = 0; i < n-x; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*x-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int a=1;
        for (int x = 1; x <= n-1; x++) {
            for (int k = 0; k <= x-1; k++) {
                System.out.print(" ");
            }
            for (int i = 2; i <2*n-a ; i++) {
                System.out.print("*");
            }
            a=a+2;


            System.out.println(" ");
        }
    }

    public void elmasYap(){
        Scanner girdi= new Scanner(System.in);
        int n= girdi.nextInt();

        for (int x = 1; x <= n; x++) {
            for (int i = 0; i < n-x; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*x-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
