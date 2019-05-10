package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCoutse = 600;
    private static int id = 1000;
    //constructor prompt user to enter student's name and year
    public Student (){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();


        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen \n2 = Sophmore\n" +
                "3 - Junior\n4 - Senior\n" +
                "Enter student class level:");
        this.gradeYear = in.nextInt();

        this.setStudentId();

        System.out.println(firstName+ " " + lastName+ " " + gradeYear + " " + studentId );
    }

    //generate an ID
    private void setStudentId(){
        //Grade Level + id
        id++;
        this.studentId = this.gradeYear + "" +id;
    }
    //enroll in courses

    //view balance

    //pay tuition

    //show status

}
