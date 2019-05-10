package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
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
    public void enroll(){
        //run a loop till user hits 0
        String course = "";
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            course = in.nextLine();
            if(!course.equals("Q")){
                this.courses = this.courses + "\n" + course;
                this.tuitionBalance += this.costOfCoutse;
            }
        } while(!course.equals("Q"));

        System.out.println("Enrolled in: " + this.courses);
        System.out.println("Tuition Balance: " + this.tuitionBalance);
    }
    //view balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + this.tuitionBalance);
    }
    //pay tuition
    public void payTuition(){
        this.viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        this.viewBalance();
    }

    //show status
    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName
                + "\nStudent Id: " + this.studentId
                + "\nGrade Level: " + this.gradeYear
                + "\nCourses Enrolled: " + this.courses
                + "\nBalance: $" + tuitionBalance;
    }
}
