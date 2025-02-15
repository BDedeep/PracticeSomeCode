package AbstractClass;

abstract class vehicle {
    String brand;


    vehicle(String brand){
         this.brand = brand;
    }
    abstract void start();

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}
class Car extends vehicle {
    Car(String brand) {
        super(brand);
    }
    void start() {
        System.out.println(brand + "car is running");
    }
}
class AbstractExample{
    public static void main(String[] args){
        Car c = new Car("BMW");
        c.start();
        c.displayInfo();
    }
}