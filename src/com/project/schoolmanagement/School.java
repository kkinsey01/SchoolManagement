package com.project.schoolmanagement;


/* Kyler Kinsey
    creates a school object using a list of
    students and teachers and calculates the school's balance
    based on student's paid fees and salary
 */
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;
    private int totalBalance;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void setTotalMoneyEarned() {
        this.totalMoneyEarned = 0;
        for(int i = 0; i < students.size(); i++) {
            this.totalMoneyEarned += students.get(i).getTotalPaidFees();
        }
    }
    public int getTotalMoneyEarned() {
        setTotalMoneyEarned();
        return this.totalMoneyEarned;
    }
    public void setTotalMoneySpent() {
        this.totalMoneySpent = 0;
        for(int i = 0; i < teachers.size(); i++) {
            this.totalMoneySpent += teachers.get(i).getSalary();
        }
    }
    public int getTotalMoneySpent() {
        setTotalMoneySpent();
        return this.totalMoneySpent;
    }
    public int totalBalance() {
        this.totalBalance = getTotalMoneyEarned() - getTotalMoneySpent();
        return this.totalBalance;
    }

}

