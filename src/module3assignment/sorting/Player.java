package module3assignment.sorting;

public class Player {
    private String name;
    private String team;
    private int games;
    private int atBats;
    private int runs;
    private int hits;
    private int doubles;
    private int triples;
    private int homeRuns;
    private int rbi;

    public Player(String name, String team, int games, int atBats, int runs, int hits, int doubles, int triples, int homeRuns, int rbi) {
        this.name = name;
        this.team = team;
        this.games = games;
        this.atBats = atBats;
        this.runs = runs;
        this.hits = hits;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.rbi = rbi;
    }

    public int getHits() {
        return hits;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public int getRbi() {
        return rbi;
    }

    public int getRuns() {
        return runs;
    }

    public int getAtBats() {
        return atBats;
    }

    @Override
    public String toString() {
        return name + "," + team + "," + games + "," + atBats + "," + runs + "," + hits + "," + doubles + "," + triples + "," + homeRuns + "," + rbi;
    }
}
