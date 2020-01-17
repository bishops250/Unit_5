// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************

import java.util.Scanner;

public class Student {
    //declare instance data

    Scanner user_input = new Scanner(System.in);

    private String studentName;
    private double test_score_1;
    private double test_score_2;

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------


    public Student() {
        this.studentName = "JohnDoe";
        this.test_score_1 = 0.0;
        this.test_score_2 = 0.0;
    }

    public Student(String studentName) {

        test_score_1 = 0.0;
        test_score_2 = 0.0;
        this.studentName = studentName; //add body of constructor
    }


    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades() {
        System.out.println("Please enter " + this.studentName + "'s score for test1.");
        test_score_1 = user_input.nextDouble();

        System.out.println("Please enter " + this.studentName + "'s score for test2.");
        test_score_2 = user_input.nextDouble();
        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage() //????? Should this be a double instead????
    {
        return (test_score_1 + test_score_2) / 2.0;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName() {
        return this.studentName;
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
    public String toString() {
        return "Name: " + this.studentName + " Test1: " + this.test_score_1 + " Test2: " + this.test_score_2;
    }

}
