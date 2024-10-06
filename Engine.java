public class Engine {
    FuelType fuelType;
    double currentFuelLevel;
    double defaultLevel;

    public Engine(FuelType fuel, double currentFuelLevel, double tankCapacity) {
        this.fuelType=fuel;
        this.currentFuelLevel = currentFuelLevel;
        this.defaultLevel=tankCapacity;
    }
    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
    public void refuel(){
        this.currentFuelLevel = defaultLevel;
    }
    public boolean go(){
        if(currentFuelLevel <= 0){
            System.out.println("Out of fuel. Need a refill!");
            return false;
        }else{
            System.out.println("Choo choo! You're left with " + currentFuelLevel + " gallons of fuel!");
            this.currentFuelLevel -= 1;
            return true;
        }

    }
}