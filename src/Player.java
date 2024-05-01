public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // setters and getters
    String getName() { return name; }
    int getScore() { return score; }

    void setName(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }
}
