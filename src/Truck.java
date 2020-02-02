public class Truck {
    public String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private final double CAPACITY = 20;
    private static double totalFuel;


    public Truck(String truckID) {

        this.truckID= truckID;
        this.odometer= 0.0;
        this.mpg= 0.0;
        this.fuel= 0.0;
        totalFuel+=this.fuel;
    }

    public Truck(String truckID,double odometer, double mpg, double fuel) {
        this.truckID= truckID;
        this.odometer= odometer;
        this.mpg= mpg;
        this.fuel= fuel;

    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public String getTruckID() {
        return truckID;
    }

    public String drive(double miles) {
        if(enoughFuel(miles)) {
            odometer+=miles;
            fuel -=(miles/mpg);

            return "Success";
        }
        else {
            return "Truck "+truckID+ " does not have enough fuel to drive "+miles+ " miles.";
        }
    }

    public double getCAPACITY() {
        return this.CAPACITY;
    }

    public double getMpg() {
        return this.mpg;

    }

    public double getFuel() {
        return this.fuel;
    }

    public double getOdometer() {
        return this.odometer;
    }

    public static double getTotalFuel() {
        return totalFuel;
    }

    public boolean enoughFuel(double miles) {
       return (this.mpg * this.fuel)>=miles;
    }


    public void fill() {
        totalFuel += (this.CAPACITY - this.fuel);
        this.fuel = this.CAPACITY;
    }

    public String fill(double gallons) {
        if(this.fuel +gallons<=this.CAPACITY) {
            this.fuel += gallons;
            totalFuel += gallons;
            return "Success";
        }
        else {
            return "Truck "+ truckID+ ": Gallons exceeds tank capacity";
        }

    }

    public String toString() {

        return "Truck: "+truckID+"\n"+"Odometer: "+odometer+"\n"+"Miles Per Gallon: " +mpg+"\n"+"Fuel: "+fuel;
    }
}

