public class TruckTest {

    public static void main(String[]args) {
        Truck truck1= new Truck("123ABC");
        Truck truck2= new Truck("456DEF",45500,18,10);

        truck1.setMps(15);
        truck1.fill();
        truck1.drive(150);
        System.out.println(truck1);

        truck1.drive(60);
        System.out.println(truck1);


        truck2.drive(500);
        truck2.fill(30);
        truck2.fill();
        truck2.drive(300);
        System.out.println(truck2);

        System.out.println(Truck.getTotalFuel());

    }
}
