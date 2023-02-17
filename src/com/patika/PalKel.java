package com.patika;

import java.util.Scanner;

public class PalKel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String girdi=input.nextLine();
        if (isPalindrome(girdi)){
            System.out.println(girdi+ " Bir palindromdur");
        } else System.out.println(girdi+" palindrom değil");


    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
}
