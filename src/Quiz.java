import java.util.ArrayList;

public class Quiz {
    Player p1;
    Player p2;
    ArrayList<Question> questions;
    ArrayList<Integer> answers;

    public Quiz(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        questions = new ArrayList<>();
        answers = new ArrayList<>();
    }

    void addQuestion(Question q) {
        questions.add(q);
    }

    void addAnswer(Integer a) {
        answers.add(a);
    }

    void removeQuestion(Question target) {
        for (Question q : questions) {
            if (target == q) {
                questions.remove(q);
            }
        }
    }

    void removeAnswer(Integer target) {
        for (Integer a : answers) {
            if (target == a) {
                answers.remove(a);
            }
        }
    }

    // setters and getters
    Player getPlayer1() { return p1; }
    Player getPlayer2() { return p2; }
    ArrayList<Question> getQuestions() { return questions; }
    ArrayList<Integer> getAnswers() { return answers; }

    void setPlayer(Player p) { player = p; }
}
