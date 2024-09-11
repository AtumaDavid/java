package ObjectOrientedProgramming;

import java.util.Scanner;

class Student {
//    Data Members
    int studentId;
    String studentName;
    int studentAge;
    Scanner scanner = new Scanner(System.in);

//    Member Function
    public void acceptDetails(){
        System.out.print("Enter Student Id: ");
        studentId = scanner.nextInt();
        System.out.print("Enter Student Name: ");
        studentName = scanner.next();
        System.out.print("Enter Student Age: ");
        studentAge = scanner.nextInt();
    }
    public void displayDetails(){
        System.out.println("student ID " + studentId);
        System.out.println("student Name " + studentName);
        System.out.println("student Age " + studentAge);
    }
}

public class ClassesAndObjects {
    public  static void  main(String[] args){
//        Creating an object of the Class student
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();

//        more than one
        Student student1 = new Student();
        student1.acceptDetails();
        student1.displayDetails();
    }
}
