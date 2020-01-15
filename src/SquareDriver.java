import java.util.Scanner;

public class SquareDriver {

    public static void main(String[]args) {
        Scanner user_input= new Scanner(System.in);

        double square_side= user_input.nextDouble();
        Square s= new Square(square_side);

        System.out.println(s);
        System.out.println(s.calculateArea());


    }

}
