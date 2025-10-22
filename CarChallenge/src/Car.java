public  class Car extends Vehicle implements Drivable{

    public Car(String brand, String model, int year) {
        super(brand, model, year);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }
    @Override
    public void accelerate() {
        System.out.println("accelerating Car");
    }
    @Override
    public void brake() {
        System.out.println("braking Car");
        System.out.println("#########################");


    }
    @Override
    public void start() {
        System.out.println("starting Car");

    }
}
