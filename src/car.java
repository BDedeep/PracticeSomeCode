public class car {
    // Attributes
    private String brand;
    private int speed;

    // Constructor
    car(String brand) {
        this.brand = brand;
        this.speed = 0; // Initial speed is 0
    }

    // Method to increase speed
    public void speedUp(int increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println(brand + " accelerated. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid speed increase.");
        }
    }

    // Method to decrease speed
    public void brake(int decrement) {
        if (decrement > 0 && decrement <= speed) {
            speed -= decrement;
            System.out.println(brand + " slowed down. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("Brake value too high or invalid.");
        }
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

