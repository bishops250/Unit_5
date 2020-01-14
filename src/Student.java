// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data

    private String studentName;
    private double test_score_1;
    private double test_score_2;

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        test_score_1=0.0;
        test_score_2=0.0;
       this.studentName=studentName; //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Please enter "+this.studentName+ "'s score for test1");
        test_score_1=

        System.out.println("Please enter \"+this.studentName+ \"'s score for test2");
        test_score_2=
        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    {
        //add body of getAverage
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    {
        //add body of printName
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91


}
