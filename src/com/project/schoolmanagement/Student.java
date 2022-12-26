package com.project.schoolmanagement;

/* Kyler Kinsey
   Student class with all the information pertaining to the students of the school
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int totalFees;
    private int totalPaidFees;
    private int balance;

    public Student() {
        this.id = 00000;
        this.name = "";
        this.grade = 0;
        this.totalFees = 100000;
        this.totalPaidFees = 0;
        this.balance = 100000;
    }
    public Student(int id, String name, int grade, int paidFees) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.totalFees = 100000;
        this.totalPaidFees = paidFees;
        this.balance = this.totalFees - this.totalPaidFees;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int getGrade() {
        return grade;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public int getTotalPaidFees() {
        return totalPaidFees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int paidFees) {
        this.totalPaidFees = paidFees;
        setBalance(paidFees);
    }
    private void setBalance(int paidFees) {
        this.balance = this.balance - paidFees;
    }
    @Override
    public String toString() {
        return this.name + " has a balance of " + this.balance;
    }
}