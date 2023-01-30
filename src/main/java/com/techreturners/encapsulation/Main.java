package com.techreturners.encapsulation;

public class Main {

    public static void main(String[] args){
        // Success Case
        Student student =  new Student("Uday", Grade.B, 4);
        System.out.println(student);
        // upgrading student grade
        student.upgradeGrade();
        System.out.println(student);
        // downgrading student grade
        student.downgradeGrade();
        System.out.println(student);

        // Student group out of range
        Student student2 = new Student("Bhaskar", Grade.C, 7);
        System.out.println(student2);
    }
}
