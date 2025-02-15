// Main class
class CarExample {
    public static void main(String[] args) {
        // Creating a Car object
        car myCar = new car("Toyota");

        // Display initial details
        myCar.displayInfo();

        // Accelerating and braking
        myCar.speedUp(30);
        myCar.speedUp(20);
        myCar.brake(10);
        myCar.brake(50); // Invalid braking

        // Final state
        myCar.displayInfo();
    }
}
