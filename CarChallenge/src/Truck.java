import java.time.Year;

public  class Truck extends Vehicle implements Drivable, Serviceable{

    public Truck(String model, String brand, int year) {
        super(model, brand, year);
        this.year = year;

    }

    @Override
    public String getFuelType() {
        return "Carizon";
    }
    @Override
    public void accelerate() {
        System.out.println("ACCELERATE Truck");
    }
    @Override
    public void brake() {
        System.out.println("BRAKE Truck");
        System.out.println("#########################");

    }
    @Override
    public void start(){
        System.out.println("START Truck");
    }
    @Override
    public void performService(){
        int currentYear = Year.now().getValue(); // get current year
        int age = currentYear - year; // calculate truck age
        System.out.println("Truck age: " + age + " years");

         System.out.println("Maintenance required!");
         System.out.println("Turbo changed !");
         System.out.println("Tire changed!");
         System.out.println("emptying !");
         System.out.println("Truck is in good condition Now.");

    }
    @Override
    public boolean needsService() {
        int currentYear = Year.now().getValue();
        return (currentYear - year) > 5;
    }
}
