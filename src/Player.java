import java.util.ArrayList;

public class Player {
    String name;
    int score;
    long time;
    ArrayList<String> answers;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.time = 0;
        answers = new ArrayList<>();
    }

    // setters and getters
    String getName() { return name; }
    int getScore() { return score; }
    long getTime() { return time; }
    ArrayList<String> getAnswers() { return answers; }

    void setName(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }

    void setTime(long time) {
        this.time = time;
    }
}
