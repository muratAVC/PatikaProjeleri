package com.patika.calisan;

import java.util.Scanner;

public class CalisanTakip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çalışanın Adını giriniz");
        String adi= input.nextLine();
        System.out.println("Çalışanın Maaşını giriniz");
        double maas= input.nextDouble();
        System.out.println("Çalışanın haftalık çalışma saatini giriniz");
        int hafta= input.nextInt();
        System.out.println("Çalışanın işe giriş yılını giriniz");
        int giris= input.nextInt();

        Employee e1= new Employee(adi,maas,hafta,giris);
        e1.soString();
    }

}
