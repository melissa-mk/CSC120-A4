import java.util.ArrayList;

public class Train {
    Engine engine;
    ArrayList<Car> cars;

    public Engine getEngine() {
        return engine;
    }

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = getEngine();
        this.cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Car> addCar(Car car, ArrayList<Car> cars) {
        cars.add(car);
        return cars;
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

    public int getMaxCapacity() {
        int trainCapacity = 0;
        for (Car car : cars) {
            trainCapacity += car.carCapacity;
        }
        return trainCapacity;
    }

    public int openSeats() {
        int openSeats = 0;
        for (Car car : cars) {
            openSeats += car.seatsRemaining();
        }
        return openSeats;
    }

    public void printManifest(ArrayList<Car> cars) {
        for (Car car : cars) {
            car.printManifest();
        }
    }

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
        p2.getOffCar(c);
        Train t = new Train(FuelType.ELECTRIC, 40, 5, 100);
        c.printManifest();
        e.go();
    }
}
