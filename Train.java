import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * getter
     * @return the type of engine being used by the train
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * constructor
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = getEngine();
        this.cars = new ArrayList<>();
    }

    /**
     * getter
     * @return information about all the train's cars
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * adds a new car to the train, returns the updated train's cars
     * @param car
     * @param cars
     * @return
     */
    public ArrayList<Car> addCar(Car car, ArrayList<Car> cars) {
        cars.add(car);
        return cars;
    }

    /**
     * getter
     * @param i
     * @return the car at index i
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * getter
     * @return the combined capacity of the train's cars
     */
    public int getMaxCapacity() {
        int trainCapacity = 0;
        for (Car car : cars) {
            trainCapacity += car.getCarCapacity();
        }
        return trainCapacity;
    }

    /**
     *
     * @return how many seats are free in the whole train
     */
    public int seatsRemaining() {
        int openSeats = 0;
        for (Car car : cars) {
            openSeats += car.seatsRemaining();
        }
        return openSeats;
    }

    /**
     * prints each car's information
     * @param cars
     */
    public void printManifest(ArrayList<Car> cars) {
        for (Car car : cars) {
            car.printManifest();
        }
    }

    /**
     * Demonstrates the integration of the car, engine, and passenger classes
     * @param args The command line arguments (ignored)
     **/
    public static void main(String[] args) {
        Passenger p = new Passenger("Melissa");
        Passenger p1 = new Passenger("Marissa");
        Passenger p2 = new Passenger("Marina");
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(p);
        passengers.add(p1);
        passengers.add(p2);
        Engine e = new Engine(FuelType.ELECTRIC, 40, 4000);
        Car c = new Car(passengers, 5);
        Car c1 = new Car(passengers, 7);
        p.boardCar(c1);
        p1.boardCar(c1);
        p2.boardCar(c);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c);
        cars.add(c1);
        cars.size();
        p2.getOffCar(c);
        Train t = new Train(FuelType.ELECTRIC, 40, 5, 100);
        t.printManifest(cars);
        c.printManifest();
        e.go();
    }
}
