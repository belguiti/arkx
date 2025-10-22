import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Corolla", 2020) );
        vehicles.add(new Moto("Yamaha", "R1", 2019) );
        vehicles.add(new Truck("Volvo", "FH16", 2024) );

        //show all vehicles info
        for (Vehicle v : vehicles) {
            v.displayInfo();

            // If it’s drivable, call driving methods
            //instanceof : verified si object v implement interface
            //crée une variable d qui référence v en tant que Drivable.
            if (v instanceof Drivable d) {
                d.start();
                d.accelerate();
                d.brake();
            }

            // If it’s serviceable, call service methods
            if (v instanceof Serviceable s) {
                if (s.needsService()) {
                    s.performService();
                } else {
                    System.out.println("No service needed for this vehicle.");
                    System.out.println("---------------------------");
                }
            }
        }
    }
}