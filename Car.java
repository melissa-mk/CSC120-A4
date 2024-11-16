import java.util.ArrayList;

/**
 * @author mkabalisa
 * Car program to handle passengers of individual train cars
 */
public class Car {
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int carCapacity;

    /**
     * constructor
     */
    public Car() {}

    /**
     * constructor
     * @param passengers
     * @param carCapacity
     */
    public Car(ArrayList<Passenger> passengers, int carCapacity) {
        this.passengers = passengers;
        this.carCapacity = carCapacity;
    }

    /**
     *
     * @return carCapacity the maximum number of passengers the car can hold
     */
    public int getCarCapacity() {
        return carCapacity;
    }

    /**
     *
     * @return information about passengers who are in the car
     */
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    /**
     *
     * @return the number of free seats; the car capacity minus the number of current passengers
     */
    public int seatsRemaining() {
        return getCarCapacity() - passengers.size();
    }

    /**
     *
     * @param passengers
     * @return true if the car has any space for a new passenger, false otherwise
     */
    public boolean carSpaceAvailable(ArrayList<Passenger> passengers) {
        if(carCapacity==passengers.size()){
            System.out.println("Car is full!");
            return false;
        }else{
            if(carCapacity<passengers.size() || passengers.isEmpty()) {
                System.out.println("Car has space!");
            }
            return true;
        }
    }
    public boolean addPassenger(Passenger passenger) {
        if (carSpaceAvailable(passengers) && !passengers.contains(passenger)) { // checks for *space* to onboard a *new* passenger
            passengers.add(passenger);
            return true;
        }else {
            return false;
        }
    }
    public boolean removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)){ //checks if the passenger is onboard before removing them
            passengers.remove(passenger);
            return true;
        }else {
            return false;
        }
    }
    public void printManifest(){
        if(passengers!=null) {
            for (Passenger passenger : passengers) {
                System.out.println(passenger.name);
            }
        }else{
            System.out.println("Car is empty!");
        }
    }
}