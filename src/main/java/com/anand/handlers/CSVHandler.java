package com.anand.handlers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVHandler {
    private static final String[] HEADERS = {"ID", "PLAYER_NAME", "TEAM", "GAMES", "GOALS", "ASSISTS", "YELLOW_CARDS", "RED_CARDS"};

    public static void readCSVAndInsertToDB(File file) {
        try (Reader reader = new FileReader(file)) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader(HEADERS).withFirstRecordAsHeader());
            for (CSVRecord csvRecord : csvParser) {
                String id = csvRecord.get("ID");
                String playerName = csvRecord.get("PLAYER_NAME");
                String team = csvRecord.get("TEAM");
                int games = Integer.parseInt(csvRecord.get("GAMES"));
                int goals = Integer.parseInt(csvRecord.get("GOALS"));
                int assists = Integer.parseInt(csvRecord.get("ASSISTS"));
                int yellowCards = Integer.parseInt(csvRecord.get("YELLOW_CARDS"));
                int redCards = Integer.parseInt(csvRecord.get("RED_CARDS"));

                String insertQuery = String.format("INSERT INTO SOCCER_STATS (ID, PLAYER_NAME, TEAM, GAMES, GOALS, ASSISTS, YELLOW_CARDS, RED_CARDS) VALUES ('%s', '%s', '%s', %d, %d, %d, %d, %d)",
                        id, playerName, team, games, goals, assists, yellowCards, redCards);

                DatabaseHandler.getHandler().execAction(insertQuery);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void writeDBToCSV(File file) {
        try (Writer writer = new FileWriter(file)) {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(HEADERS));
            ResultSet resultSet = DatabaseHandler.getHandler().execQuery("SELECT * FROM SOCCER_STATS");
            while (resultSet.next()) {
                csvPrinter.printRecord(
                        resultSet.getString("ID"),
                        resultSet.getString("PLAYER_NAME"),
                        resultSet.getString("TEAM"),
                        resultSet.getInt("GAMES"),
                        resultSet.getInt("GOALS"),
                        resultSet.getInt("ASSISTS"),
                        resultSet.getInt("YELLOW_CARDS"),
                        resultSet.getInt("RED_CARDS")
                );
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
