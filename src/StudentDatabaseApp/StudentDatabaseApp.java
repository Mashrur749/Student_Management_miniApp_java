package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //ask how many new users to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in  = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create n number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println("\n\nSummery:");
            System.out.println(students[i]);
            System.out.println("\n\n");
        }
    }
}
