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

    public double getTripDistance() {

    }
    public double getAverageSpeed(){

    }
    public double getGasMileage(){
        return (this.myStartOdometer-this.myEndOdometer) /this.myGallonsUsed;
    }
    public double getTotalGasPrice(double pricePerGallon){

        return this.myGallonsUsed * pricePerGallon;
    }
    public String toString(){

    }


}
