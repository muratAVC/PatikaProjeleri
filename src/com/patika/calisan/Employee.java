package com.patika.calisan;

public class Employee {
    String name;
    double salary;//maaşı
    int weekWorkHours;
    int hireYear;//başlangıç yılı

    Employee(String name,double salary,int weekWorkHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.weekWorkHours=weekWorkHours;
        this.hireYear=hireYear;

    }

    double tax(double salary){
        if (salary>1000){
            return salary*0.03;
        } else {
            return 0;
        }
    }

    double bonus(int weekWorkHours){
        if (weekWorkHours>40){
            return (weekWorkHours-40)*4*30.0;//fazla mesaiyi aylık hesaplar
        } else return 0;
    }
    double raiseSalary(int hireYear){
        int a=2021-hireYear;
        if (a<10){
            return this.salary*0.05;
        }
        if (a<20 && a>9){
            return this.salary*0.1;
        } else {
            return this.salary*0.15;
        }
    }

    void soString(){
        System.out.println("Adı = "+this.name);
        System.out.println("Maaşı = " +this.salary);
        System.out.println("Haftalık Çalışma saati = "+ this.weekWorkHours);
        System.out.println("işe Başlama Yılı = "+this.hireYear);
        System.out.println("Vergi = "+ this.tax(this.salary) );
        System.out.println("Fazla Mesai = "+ this.bonus(this.weekWorkHours) );
        System.out.println("Kıdem Maaş artışı = "+ this.raiseSalary(this.hireYear));
        System.out.println("vergi ve Mesai ile birlikte maaş = " + (this.salary+this.bonus(this.weekWorkHours)+this.tax(this.salary)));
        System.out.println("Toplam Maaş = "+ (this.salary+this.bonus(this.weekWorkHours)+this.tax(this.salary)+this.raiseSalary(this.hireYear)));
    }
}
/*
Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0
 */