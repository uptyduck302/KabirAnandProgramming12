package module3assignment.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class MergeSortAssignment {

    public static List<Player> readPlayers(String fileName) throws IOException {
        List<Player> players = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if (values.length == 10) { // Ensure there are exactly 10 values
                Player player = new Player(
                        values[0], values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                        Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]),
                        Integer.parseInt(values[7]), Integer.parseInt(values[8]), Integer.parseInt(values[9])
                );
                players.add(player);
            } else {
                System.err.println("Skipping line: " + line);
            }
        }
        br.close();
        return players;
    }

    public static void sortAndWrite(List<Player> players, Comparator<Player> comparator, String fileName) throws IOException {
        players.sort(comparator);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Player player : players) {
            writer.write(player.toString());
            writer.newLine();
        }
        writer.close();
    }

    public static void main(String[] args) {
        try {
            List<Player> players = readPlayers("src/module3assignment/sorting/PlayerData.csv");
            sortAndWrite(players, Comparator.comparing(Player::getHits).reversed(), "sorted_by_hits.txt");
            sortAndWrite(players, Comparator.comparing(Player::getHomeRuns).reversed(), "sorted_by_homeruns.txt");
            sortAndWrite(players, Comparator.comparing(Player::getRbi).reversed(), "sorted_by_rbi.txt");
            sortAndWrite(players, Comparator.comparing(Player::getRuns).reversed(), "sorted_by_runs.txt");
            sortAndWrite(players, Comparator.comparing(Player::getAtBats).reversed(), "sorted_by_atbats.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
