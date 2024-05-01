import java.util.ArrayList;

public class Quiz {
    Player player;
    ArrayList<Question> questions;
    ArrayList<Integer> answers;

    public Quiz(Player player) {
        this.player = player;
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
    Player getPlayer() { return player;}
    ArrayList<Question> getQuestions() { return questions; }
    ArrayList<Integer> getAnswers() { return answers; }

    void setPlayer(Player p) { player = p; }
}
