public class Fraction {
    private int denominator;
    private int numerator;

    public Fraction(int numerator, int denominator) {

        if(numerator<0 && denominator>=0) {
            numerator *=1;
            denominator *=-1;
        }
        else if(numerator <0 && denominator<0) {
            numerator *=-1;
            denominator *=-1;
        }
        else if(numerator==0) {
        }

        else if(denominator==0) {
            return;
        }
        this.numerator=numerator;

    }

    public Fraction() {
        this(0,0);

    }


}
