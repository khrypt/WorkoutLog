package domain;

public class Exercise {
    private String name;
    private int noSets;
    private int noReps;

    public Exercise(String name, int noSets, int noReps) {
        this.name = name;
        this.noSets = noSets;
        this.noReps = noReps;
    }

    public String getName() {
        return name;
    }

    public int getNoSets() {
        return noSets;
    }

    public int getNoReps() {
        return noReps;
    }
}
