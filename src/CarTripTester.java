public class CarTripTester {

    public static void main(String[]args) {

        CarTrip default_car_trip= new CarTrip();
        CarTrip car_trip_parameters= new CarTrip(0,500,20,60);
        System.out.println(default_car_trip);
        System.out.println(car_trip_parameters);

    }
}
