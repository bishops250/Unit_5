public class CarTrip {

    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip() {
        this.myStartOdometer=0.0;
        this.myEndOdometer=0.0;
        this.myTime= 0.0;
        this.myGallonsUsed=0.0;
    }

    public CarTrip(double myStartOdometer, double myEndOdometer,double myTime,double myGallonsUsed) {
        this.myStartOdometer= myStartOdometer;
        this.myEndOdometer= myEndOdometer;
        this.myTime= myTime;
        this.myGallonsUsed= myGallonsUsed;

    }
    public double getMyStartOdometer() {
        return this.myStartOdometer;
    }
    public double getMyEndOdometer() {
        return this.myEndOdometer;
    }
    public double getMyGallonsUsed() {
        return this.myGallonsUsed;
    }
    public double getMyTime() {
        return this.myTime;
    }



    public double getTripDistance() {
        return  this.myEndOdometer-this.myStartOdometer;
    }
    public double getAverageSpeed() {
        if (this.myTime == 0) {
            return 0.0;
        } else {
            return (this.myEndOdometer - this.myStartOdometer) / this.myTime;
        }
    }
    public double getGasMileage() {
        if (this.myGallonsUsed == 0) {
            return 0.0;
        } else {
            return (this.myEndOdometer-this.myStartOdometer ) / this.myGallonsUsed;
        }
    }
    public double getTotalGasPrice(double pricePerGallon){

        return this.myGallonsUsed * pricePerGallon;
    }
    public String toString(){

        return "Distance traveled: " + getTripDistance() + " miles";
    }


}
