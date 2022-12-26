package com.project.schoolmanagement;

/* Kyler Kinsey
   Teacher class with all the information pertaining to the teachers of the school
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher() {
        this.id = 00000;
        this.name = "";
        this.salary = 0;
    }
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setID(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return this.name + " has a salary of " + this.salary;
    }
}
