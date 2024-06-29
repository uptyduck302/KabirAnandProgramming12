public class Main {
    public static void main(String[] args) {
        Increment increment = new Increment();
        System.out.println(increment.value);
        increment.getNext();
        System.out.println(increment.value);
    }
}
