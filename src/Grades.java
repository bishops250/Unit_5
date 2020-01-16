
// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        //create student2, "Mike"

        Student student2 = new Student("Mike");

        student1.inputGrades();
        System.out.println(student1);
        System.out.println(student1.getAverage());
        //input grades for Mary
        //print Mary
        //use getAverage to calculate & print average for Mary

        student2.inputGrades();
        System.out.println(student2);
        System.out.println("The average for " + student2.getName() + " is " + student2.getAverage());

        //input grades for Mike
        //print Mike
        //use getAverage to calculate & print average for Mike

    }
}

