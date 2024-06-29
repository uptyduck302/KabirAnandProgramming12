import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle>  vehicles = new ArrayList<>();
        vehicles.add(new Truck());
        vehicles.add(new Car());
        vehicles.add(new Motorcycle(true));

        for(Vehicle v : vehicles){
            v.honk();
        }


    }
}