package module3assignment.recursion;

public class Sequences {

    // Sequence 1: 25, 23, 21, ...
    public static int seq1(int n) {
        if (n == 1) {
            return 25;
        } else {
            return seq1(n - 1) - 2;
        }
    }

    // Sequence 2: 1, 2, 4, ...
    public static int seq2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * seq2(n - 1);
        }
    }

    // Sequence 3: 2, 2, 4, ...
    public static int seq3(int n) {
        if (n == 1 || n == 2) {
            return 2;
        } else {
            return seq3(n - 1) + seq3(n - 2);
        }
    }

    // Sequence 4: 3, 3, 6, ...
    public static int seq4(int n) {
        if (n == 1 || n == 2) {
            return 3;
        } else {
            return seq4(n - 1) + seq4(n - 2);
        }
    }

    // Sequence 5: 1, 2, 6, ...
    public static int seq5(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * seq5(n - 1);
        }
    }

    public static void main(String[] args) {
        // Test each sequence
        System.out.println("Sequence 1:");
        for (int i = 1; i <= 9; i++) {
            System.out.print(seq1(i) + " ");
        }
        System.out.println();

        System.out.println("Sequence 2:");
        for (int i = 1; i <= 9; i++) {
            System.out.print(seq2(i) + " ");
        }
        System.out.println();

        System.out.println("Sequence 3:");
        for (int i = 1; i <= 9; i++) {
            System.out.print(seq3(i) + " ");
        }
        System.out.println();

        System.out.println("Sequence 4:");
        for (int i = 1; i <= 9; i++) {
            System.out.print(seq4(i) + " ");
        }
        System.out.println();

        System.out.println("Sequence 5:");
        for (int i = 1; i <= 9; i++) {
            System.out.print(seq5(i) + " ");
        }
        System.out.println();
    }
}

