public class Motorcycle extends Vehicle {
    public boolean hasSideCar;

    public Motorcycle(int registrationNumber, Person owner, boolean hasSideCar) {
        super(registrationNumber, owner);
        this.hasSideCar = hasSideCar;
    }

    public Motorcycle(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public String toString() {
        return "Motorcycle, Owner: " + owner;
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle goes vroom");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Motorcycle) {
            Motorcycle other = (Motorcycle) obj;
            return this.owner.equals(other.owner);
        }
        return false;
    }
}

