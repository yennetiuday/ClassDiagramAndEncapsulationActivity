package com.techreturners.encapsulation;

import java.sql.Array;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private Grade grade;
    private Integer group;
    private String mySecretNickName;

    private static final Integer MINIMUM_GROUP = 1;
    private static final Integer MAXIMUM_GROUP = 5;
    private static final Integer DEFAULT_GROUP = 5;

    public Student(String name, Grade grade, Integer group) {
        this.name = name;
        this.grade = grade;
        if(group >= MINIMUM_GROUP && group <= MAXIMUM_GROUP) {
            this.group = group;
        }
        mySecretNickName = name+group+grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", group=" + group + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Integer getGroup() {
        return group;
    }

    public String getMySecretNickName() {
        return mySecretNickName;
    }

    public void upgradeGrade() {
        switch(grade) {
            case A :
                break;
            case B:
                grade = Grade.A;
                break;
            case C:
                grade = Grade.B;
                break;
            case D:
                grade = Grade.C;
                break;
            case E:
                grade = Grade.D;
                break;
            case F:
                grade = Grade.E;
                break;
        }
    }

    public void downgradeGrade() {
        switch(grade) {
            case A:
                grade = Grade.B;
                break;
            case B:
                grade = Grade.C;
                break;
            case C:
                grade = Grade.D;
                break;
            case D:
                grade = Grade.E;
                break;
            case E:
                grade = Grade.F;
                break;
            case F:
                break;
        }
    }


}
