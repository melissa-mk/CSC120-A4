import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> passengers = new ArrayList<>();
    int carCapacity;

    public Car() {}
    public Car(ArrayList<Passenger> passengers, int carCapacity) {
        this.passengers = passengers;
        this.carCapacity = carCapacity;
    }
    public int getCarCapacity() {
        return carCapacity;
    }
    public int seatsRemaining() {
        return getCarCapacity() - passengers.size();
    }
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