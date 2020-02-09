/**
 *                                                  \\//Fraction-Class\\//
 *                                                  
 * The fraction class is a class that allows the user to complete all basic operations with Fractions. This includes...
 *
 * Addition, Subtraction, Multiplication, & Division
 * Simplification & Reducing Fractions
 *
 * @author Aron D. Bishop
 * @since February 3, 2020
 */


public class Fraction {
    private int denominator; //Instantiating private variable to contain the fraction denominator
    private int numerator; //Instantiating private variable to contain the fraction numerator


    /**                                 \\//Fraction Constructor- NO Parameters\\//
     *
     * The Default Constructor for Fraction- It sets the numerator and denominator to 1.
     */

    public Fraction() {
        this(1,1); //Default numbers for Fraction constructor

    }


    /**
     *                                  \\//Fraction Constructor -With Parameters\\//
     *
     * This Fraction constructor with parameters will set the users numerator and denominator to thee instances
     * variable. The constructor will then take the instance variables and pass it to the simplification method, which
     * will then simply the fraction so the negative will be with numerator and never the denominator. Then the
     * simplified numerator and denominator are then passed to reduceFraction which will find the
     * GCD(greatest common denominator) and set the fraction to it.
     *
     * @param numerator The variable passed to the instance variable- It contains the int numerator the user added
     *
     * @param denominator The variable passed to the instance variable- It contains the int denominator the user added
     */


    public Fraction(int numerator, int denominator) {
       this.numerator=numerator;
       this.denominator=denominator;

        simplification(this);


       reduceFraction(this);


    }

    /**
     *                                                  \\//ReduceFraction\\//
     *
     *Reduces the fraction(numerator & denominator) passed to method. The Reduce Fraction method is based on
     * Euclid’s Algorithm.
     *
     * Formula:
     * 1)find the greatest common divisor(GCD) of two integers 𝑚 and 𝑛
     *
     * 2) Test to see if 𝑛 divides 𝑚 evenly- if It does then the ANSWER: GCD is n
     * 2) if 𝑛 does not divide 𝑚 evenly- then the ANSWER: is the GCD of 𝑛 and the remainder of 𝑚 divided by 𝑛
     *
     * 3) Done
     *
     * @param f1 passes fraction object to the reduceFraction method it contains the simplified fractions, which is a
     * numerator and denominator
     * @return returns the simplified fraction(numerator & denominator) as an integer number
     */

    public int reduceFraction(Fraction f1) { // I replaced the int numerator & int denominator with Fraction f1

        while (numerator % denominator != 0) {
            int oldm = numerator;
            int oldn = denominator;

            numerator = oldn;
            denominator = oldm % oldn;
        }
        return denominator;
    }

    /**
     *                                                  \\//Simplification\\//
     *
     *
     * @param f1 Passes a fraction of the users choice to simplification method.
     */
    private static void simplification(Fraction f1) {

        if (f1.denominator < 0) {
            f1.numerator *= -1;
            f1.denominator *= Math.abs(f1.denominator);
        }

        else if (f1.numerator < 0 && f1.denominator < 0) {
            f1.numerator = Math.abs(f1.numerator);
            f1.denominator = Math.abs(f1.denominator);
        }

    }

    /**
     *                                                   \\//Addition\\//
     *
     * @param f1 The first fraction- It includes a numerator & denominator
     * @param f2 The second fraction- It includes a numerator & denominator
     * @return Returns a new Fraction object with fraction addition operation completed
     */
        public static Fraction add(Fraction f1, Fraction f2) {

        int numerator1 = f1.numerator * f2.denominator;

        int numerator2 = f2.numerator * f1.denominator;

        int newFractionNumerator = numerator1 + numerator2;

        int newFractionDenominator = f1.denominator * f2.denominator;

        return new Fraction(newFractionNumerator, newFractionDenominator);

        }

    /**
     *                                                 \\//Subtraction\\//
     *
     * @param f1 The first fraction- It includes a numerator & denominator
     * @param f2 The second fraction- It includes a numerator & denominator
     * @return Returns a new Fraction object with fraction subtraction operation completed
     */
        public static Fraction subtract(Fraction f1, Fraction f2) {
            int numerator1 = f1.numerator * f2.denominator;

            int numerator2 = f2.numerator * f1.denominator;

            int newFractionNumerator = numerator1 - numerator2;

            int newFractionDenominator = f1.denominator * f2.denominator;

            return new Fraction(newFractionNumerator, newFractionDenominator);
        }

    /**
     *                                                  \\//Multiply\\//
     *
     * @param f1 The first fraction- It includes a numerator & denominator
     * @param f2 The second fraction- It includes a numerator & denominator
     * @return Returns a new Fraction object with fraction multiplication operation completed
     */
    public static Fraction multiply(Fraction f1, Fraction f2) {

            int newFractionNumerator = f1.numerator *f2.denominator ;

            int newFractionDenominator = f2.numerator * f1.denominator;


            return new Fraction(newFractionNumerator, newFractionDenominator);
        }

    /**
     *                                                  \\//Divide\\//
     * uses the mathematical formula for fraction division to find the new fraction after completing the formula.
     *
     * Formula:
     *
     * 1)Leave the first Fraction alone
     * 2) get the inverse of second fraction(switch the numerator and denominator)
     * 3)multiply inverse fractions numerator by first fraction numerator
     * 4) multiply inverse fraction denominator by first fraction denominator
     * 5)Done
     *
     * @param f1 The first fraction- It includes a numerator & denominator
     * @param f2 The second fraction- It includes a numerator & denominator
     * @return Returns a new Fraction object with fraction division operation completed
     */
        public static Fraction divide(Fraction f1, Fraction f2) {
            int f2ReciprocalNumerator= f2.denominator;
            int f2ReciprocalDenominator= f2.numerator;

            int newFractionNumerator = f1.numerator * f2ReciprocalNumerator;

            int newFractionDenominator = f1.denominator * f2ReciprocalDenominator;

            return new Fraction(newFractionNumerator, newFractionDenominator);
        }

    /**
     *                                                  \\//toString\\///
     *
     * toString is a built in java method that prints out the memory address of the object. I have over written It to
     * return a specified parameters
     *
     * @return -returns the numerator & denominator as a string
     */
    public String toString() {
            return numerator +"/"+denominator;
        }

    }
