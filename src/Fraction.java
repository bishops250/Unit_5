/**
 * @author Aron D. Bishop
 * @since February 3, 2020
 */

public class Fraction {
    private int denominator;
    private int numerator;


    public Fraction() {
        this(0,0);

    }
    public Fraction(int numerator, int denominator) {
       this.numerator=numerator;
       this.denominator=denominator;

        simplification();
       reduceFraction(this.numerator,this.denominator);


    }

    public int reduceFraction(int numerator, int denominator) {
        while (numerator % denominator != 0) {
            int oldm = numerator;
            int oldn = denominator;

            numerator = oldn;
            denominator = oldm % oldn;
        }
        return denominator;
    }

    private void simplification() {

        if(numerator<0 && denominator>=0) {
            numerator*=1;
            denominator*=-1;
        }
        else if(numerator <0 && denominator<0) {
            numerator*=-1;
            denominator*=-1;
        }

        else if(denominator==0) {
            System.out.println("Zero is the denominator meaning the fraction is UNDEFINED!");

        }

        else if(numerator==0) {
            System.out.println("The numerator is zero meaning the simplest form is zero");
        }

        public double add(int numerator,int denominator) {

        }

        public double subtract(int numerator,int denominator) {

        }

        public double multiply(int numerator, int denominator) {

        }

        public double divide() {

        }



    }




}
