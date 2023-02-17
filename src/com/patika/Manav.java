package com.patika;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double armut,elma,muz,domates,patlcan,erik,patates,sogan;
        double armutf,elmaf,muzf,domatesf,patlcanf,erikf,patatesf,soganf,toplam;
        armutf=2.14;
        elmaf=3.67;
        domatesf=1.11;
        muzf=0.95;
        patlcanf=5.00;
        erikf=3.6;
        patatesf=2.5;
        soganf=1.5;
        System.out.print("Ka kilo Armut Aldnz =");
        armut=girdi.nextDouble();
        System.out.print("Ka kilo Elma Aldnz =");
        elma=girdi.nextDouble();
        System.out.print("Ka kilo Muz Aldnz =");
        muz=girdi.nextDouble();
        System.out.print("Ka kilo Domates Aldnz =");
        domates=girdi.nextDouble();
        System.out.print("Ka kilo Patlcan Aldnz =");
        patlcan=girdi.nextDouble();
        System.out.print("Ka kilo erik Aldnz =");
        erik=girdi.nextDouble();
        System.out.print("Ka kilo patates Aldnz =");
        patates=girdi.nextDouble();
        System.out.print("Ka kilo sogan Aldnz =");
        sogan=girdi.nextDouble();

        armut=armutf*armut;
        elma=elmaf*elma;
        domates=domatesf*domates;
        muz=muz*muzf;
        patlcan=patlcanf*patlcan;
        erik=erik*erikf;
        patates=patates*patatesf;
        sogan=sogan*soganf;

        toplam=armut+elma+domates+muz+patlcan+erik+patates+sogan;

        System.out.print("toplam cret = " + toplam );
    }
}
