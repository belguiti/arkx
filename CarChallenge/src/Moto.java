public  class Moto extends Vehicle implements Drivable{

    public Moto(String model, String brand, int year) {
        super(model, brand, year);
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
    @Override
    public void accelerate() {
        System.out.println("Moto accelerate");
    }
    @Override
    public void brake() {
        System.out.println("Moto brake");
        System.out.println("#########################");

    }
    @Override
    public void start(){
        System.out.println("Moto start");

    }
}
