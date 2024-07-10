public class Main {
    static int count = 0;
    public static void printMove(int p1, int p2){
        count++;
        System.out.println("Move: " + p1 + " to " + p2);
    }
    public static void towers(int n, int from, int to, int spare){
        if(n == 1){
            printMove(from, to);
        }
        else{
            towers(n - 1, from, spare, to);
            printMove(from, to);
            towers(n - 1, spare, to, from);
        }
    }
    public static void main(String[] args) {
        towers(9,1,3,2);
        System.out.println(count);
    }
}