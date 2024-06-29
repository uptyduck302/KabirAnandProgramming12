public class Car extends  Vehicle{
    public int numberOfDoors;

    @Override
    public void honk() {
        System.out.println("car goes beep");
    }
}