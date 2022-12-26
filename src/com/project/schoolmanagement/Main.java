package com.project.schoolmanagement;

/* Kyler Kinsey
    An example main using the Teacher, Student, and School class
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher sandro = new Teacher(54365, "Sandro", 60000);
        Teacher stephen = new Teacher(65210, "Stephen", 45000);
        Teacher james = new Teacher (38921, "James", 50000);
        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(sandro);
        teacherList.add(stephen);
        teacherList.add(james);

        Student bob = new Student(565, "Bob", 87, 27000);
        Student charles = new Student(378, "Charles", 79, 45000);
        Student kate = new Student(901, "Kate", 93, 75750);
        List<Student> studentList = new ArrayList<>();

        studentList.add(bob);
        studentList.add(charles);
        studentList.add(kate);

        School upj  = new School(teacherList, studentList);
        System.out.println("UPJ currently has a balance of " + upj.totalBalance());

        System.out.println("The current teachers at UPJ are " + teacherList.toString());
        System.out.println("The current students at UPJ are " + studentList.toString());

        Student tommy = new Student(729, "Tommy", 99, 0);
        studentList.add(tommy);
        System.out.println("Tommy is a new student with a balance of " + tommy.getBalance());
        tommy.payFees(35250);
        System.out.println("With a payment of 35250, Tommy's new balance is " + tommy.getBalance());
        System.out.println("UPJ now has a balance of " + upj.totalBalance());
    }
}
