package com.anand;

import com.anand.handlers.CSVHandler;
import com.anand.handlers.DatabaseHandler;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DatabaseHandler handler = DatabaseHandler.getHandler();

        // Path to the CSV file
        File csvFile = new File("src/main/resources/soccer_stats.csv");

        // Read CSV and insert data into the database
        CSVHandler.readCSVAndInsertToDB(csvFile);

        // Export database data to a new CSV file
        File outputFile = new File("src/main/resources/soccer_stats_export.csv");
        CSVHandler.writeDBToCSV(outputFile);
    }
}
