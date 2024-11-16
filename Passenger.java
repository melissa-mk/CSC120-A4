public class Passenger {
    String name;

    /**
     * constructor
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * adds passenger to the car
     * @param c, the car the passenger is boarding
     */
    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * removes passenger from the car
     * @param c, the car the passenger is leaving from
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }
}
