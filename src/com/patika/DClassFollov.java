package com.patika;

import java.util.Scanner;

public class DClassFollov {
    public static class Teacher {
        String name;
        String mpno;
        String branch;

        public Teacher(String name, String mpno, String branch) {
            this.name = name;
            this.mpno = mpno;
            this.branch = branch;
        }

    }
    public static class Course {
        Teacher courseTeacher;
        String name;
        String code;
        String prefix;
        double note;
        double s_note;

        public Course(String name, String code, String prefix) {
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.note = 0;
            this.s_note=0;
        }

        public void addTeacher(Teacher t) {
            if (this.prefix.equals(t.branch)) {
                this.courseTeacher = t;
                System.out.println("İşlem başarılı");
            } else {
                System.out.println(t.name + " Akademisyeni bu dersi veremez.");
            }
        }

        public void printTeacher() {
            if (courseTeacher != null) {
                System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
            } else {
                System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
            }
        }
    }
    public static class Student {
        String name,stuNo;
        int classes;//Kaçıncı sınıfta olduğunun bilgisini tutuyor
        Course mat;
        Course fizik;
        Course kimya;
        Course biyoloji;
        Course turkce;
        double avarage;
        boolean isPass;


        Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya, Course biyo, Course Turk) {
            this.name = name;
            this.classes = classes;
            this.stuNo = stuNo;
            this.mat = mat;
            this.fizik = fizik;
            this.kimya = kimya;
            this.biyoloji=biyo;
            this.turkce=Turk;
            calcAvarage();
            this.isPass = false;
        }


        public void addBulkExamNote(int mat, int fizik, int kimya, int bio, int turk) {

            if (mat >= 0 && mat <= 100) {
                this.mat.note = mat*0.8;
            }

            if (fizik >= 0 && fizik <= 100) {
                this.fizik.note = fizik*0.8;
            }

            if (kimya >= 0 && kimya <= 100) {
                this.kimya.note = kimya*0.8;
            }
            if (bio>=0 && bio<=100){
                this.biyoloji.note=bio*0.8;
            }
            if (turk>=0 && turk<=100){
                this.turkce.note=turk*0.8;
            }
        }

        public  void addSNote(int mat, int fizik, int kimya, int bio, int turk){

            if (mat >= 0 && mat <= 100) {
                this.mat.s_note=mat*0.2;
            }

            if (fizik >= 0 && fizik <= 100) {
                this.fizik.s_note = fizik*0.2;
            }

            if (kimya >= 0 && kimya <= 100) {
                this.kimya.s_note = kimya*0.2;
            }
            if (bio>=0 && bio<=100){
                this.biyoloji.s_note=bio*0.2;
            }
            if (turk>=0 && turk<=100){
                this.turkce.s_note=turk*0.2;
            }
        }

        public void isPass() {//Ortalamaya göre sınıfta kaldı veya geçti kararını veriyor
            if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0|| this.biyoloji.note==0 || this.turkce.note==0) {
                System.out.println("Notlar tam olarak girilmemiş");//Eksik notları kontrol ediyor
            } else {
                cno();//Varsa sözlü notları ders notlarına ekleniyor
                this.isPass = isCheckPass();
                printNote();
                System.out.println("Ortalama : " + this.avarage);//ortalamayı yazdırıyor
                if (this.isPass) {
                    System.out.println("Sınıfı Geçti. ");
                } else {
                    System.out.println("Sınıfta Kaldı.");
                }
            }
        }

        public void cno(){//Derslerin yazılı ve sözlü ortalamalarını alıyor
            this.mat.note=this.mat.note+this.mat.s_note;
            this.fizik.note=this.fizik.note+this.fizik.s_note;
            this.kimya.note=this.kimya.note+this.kimya.s_note;
            this.biyoloji.note=this.biyoloji.note+this.biyoloji.s_note;
            this.turkce.note+=this.turkce.s_note;
        }
        public void calcAvarage() {//ortalamayı alıyor

            this.avarage = (this.fizik.note + this.kimya.note + this.mat.note+this.biyoloji.note+this.turkce.note) / 5;
        }

        public boolean isCheckPass() {//sınıfı geçip geçmediğini kontrol ediyor
            calcAvarage();
            return this.avarage > 55;
        }

        public void printNote(){
            System.out.println("=========================");
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Matematik Notu : " + this.mat.note);
            System.out.println("Fizik Notu : " + this.fizik.note);
            System.out.println("Kimya Notu : " + this.kimya.note);
            System.out.println("Biyoloji Notu : "+this.biyoloji.note);
            System.out.println("Türkçe Notu : "+this.turkce.note);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mt,ft,kt,bt,tt;

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course biyology = new Course("Biyoloji","BIO101","BIO");
        Course turkce =new Course("Türkçe","TUR101","TUR");
        System.out.println("Matematik hocasının adını giriniz");
        mt=input.nextLine();
        System.out.println("Fizik hocasının adını giriniz");
        ft=input.nextLine();
        System.out.println("Kimya hocasının adını giriniz");
        kt=input.nextLine();
        System.out.println("Biyoloji hocasının adını giriniz");
        bt=input.nextLine();
        System.out.println("Turkçe hocasının adını giriniz");
        tt=input.nextLine();

        Teacher t1 = new Teacher(mt, "90550000000", "MAT");
        Teacher t2 = new Teacher(ft, "90550000001", "FZK");
        Teacher t3 = new Teacher(kt, "90550000002", "KMY");
        Teacher t4 = new Teacher(bt,"9055354854","BIO");
        Teacher t5 = new Teacher(tt,"90553648555","TUR");



        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        biyology.addTeacher(t4);
        turkce.addTeacher(t5);


        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya, biyology, turkce);
        s1.addBulkExamNote(50,20,40,45,65);
        s1.addSNote(80,80,90,70,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya, biyology, turkce);
        s2.addBulkExamNote(100,50,40,65,84);
        s2.addSNote(75,87,57,98,87);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya, biyology, turkce);
        s3.addBulkExamNote(50,20,40,85,27);
        s3.addSNote(87,98,54,78,66);
        s3.isPass();

        Student s4 = new Student("Damat Ferit",4,"2154", mat, fizik, kimya, biyology, turkce);
        s4.addBulkExamNote(50,55,64,86,39);
        s4.addSNote(98,78,68,68,59);
        s4.isPass();

    }
}
