public class FractionPersonalTest {
    public static void main(String[]args) {
        Fraction fr1= new Fraction(3,-6);
        Fraction fr2= new Fraction(1,6);

        Fraction result= Fraction.add(fr1,fr2);
        System.out.println(fr1);
        System.out.println(result);
    }
}
