package inheritance;

class Student {
    // Data members
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student(){
        this.studentId = 100;
        this.studentName = "name";
        this.studentAge = 30;
    }

    public Student(int sId, String sName, int sAge){
        this.studentId = sId;
        this.studentName = sName;
        this.studentAge = sAge;
    }

    void displayDetails(){
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}

public class inheritance {
    public  static void  main(String[] args){
        Student student = new Student();
        student.displayDetails();

        Student student1 = new Student(100,"David", 34);
        student1.displayDetails();
    }
}
