public abstract class Vehicle {

    String brand;
    String model;
    int year;

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    // Concrete method: prints all vehicle details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + getFuelType()); // Calls the abstract method
        System.out.println("#########################");

    }

    // Abstract method: must be implemented by subclasses
    public abstract String getFuelType();

}
