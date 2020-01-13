public class Square {

    private double side;

    public String toString() {
        return "Square with side " + this.side;
    }
    public Square(double side) {

        this.side=side;
    }

    public Square() {
        this.side=2;
    }

    public double calculateArea() {
        return this.side*this.side;

    }


}

