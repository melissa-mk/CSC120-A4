public class Engine {
    private FuelType fuelType;
    private double currentFuelLevel;
    private final double defaultLevel;

    /**
     * getter
     * @return the engine's full fuel capacity
     */
    public double getDefaultLevel() {
        return defaultLevel;
    }

    /**
     * getter
     * @return the current fuel level in the engine
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * getter
     * @return what fuel the engine uses
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * setter
     * @param fuelType
     * changes what fuel the engine uses
     */
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * setter
     * @param currentFuelLevel
     * changes how much fuel the engine has
     */
    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    /**
     * constructor
     * @param fuel
     * @param currentFuelLevel
     * @param tankCapacity
     */
    public Engine(FuelType fuel, double currentFuelLevel, double tankCapacity) {
        this.fuelType=fuel;
        this.currentFuelLevel = currentFuelLevel;
        this.defaultLevel=tankCapacity;
    }

    /**
     * fills the engine i.e resets the engine's level to the default
     */
    public void refuel(){
        this.currentFuelLevel = defaultLevel;
    }

    /**
     * updates fuel level as train moves
     * @return false if the engine has enough fuel to locomote, true otherwise
     */
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