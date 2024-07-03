import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmoticonDetector {
    public static void main(String[] args) {
        // File name
        String filename = "happyorsad.txt";

        try {
            // Create a Scanner object to read the file
            Scanner fileScanner = new Scanner(new File(filename));

            // Read the first line of the file
            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Detect happy and sad emoticons
                int happyCount = 0;
                int sadCount = 0;

                for (int i = 0; i < line.length() - 2; i++) {
                    String emoticon = line.substring(i, i + 3);
                    if (emoticon.equals(":-)")) {
                        happyCount++;
                    } else if (emoticon.equals(":-(")) {
                        sadCount++;
                    }
                }

                // Print the result based on counts
                if (happyCount == 0 && sadCount == 0) {
                    System.out.println("None detected");
                } else if (happyCount == sadCount) {
                    System.out.println("unsure");
                } else if (happyCount > sadCount) {
                    System.out.println("happy");
                } else {
                    System.out.println("sad");
                }
            } else {
                System.out.println("File is empty.");
            }

            // Close the Scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
