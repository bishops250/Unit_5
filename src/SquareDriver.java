import java.util.Scanner;

public class SquareDriver {

    public static void main(String[]args) {
        Scanner user_input= new Scanner(System.in);

        Square s= new Square();

        System.out.println(s);
        System.out.println(s.calculateArea());

    }

}
