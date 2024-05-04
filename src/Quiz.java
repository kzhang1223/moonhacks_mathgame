import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    Player p1;
    Player p2;
    ArrayList<Question> questions;
    ArrayList<Integer> answers;
    int numQuestions;
    ArrayList<String> operations;

    public Quiz(Player p1, Player p2, int numQuestions) {
        this.p1 = p1;
        this.p2 = p2;
        questions = new ArrayList<>();
        answers = new ArrayList<>();
        this.numQuestions = numQuestions;

        operations = new ArrayList<>();
        operations.add("+");
        operations.add("-");
        operations.add("x");
        operations.add("/");
    }

    void createQuiz() {
        Random rand = new Random();
        int upperbound = 10;
        for (int x = 0; x < numQuestions; x++) {
            int a = rand.nextInt(upperbound);
            int b = rand.nextInt(upperbound);

            int opUpper = 3;
            int index = rand.nextInt(opUpper);
            Question q = new Question(a, b, operations.get(index));
            questions.add(q);

            int answer = a + b;
            answers.add(answer);
        }
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

    void setPlayerOne(Player p) { p1 = p; }
    void setPlayerTwo(Player p) { p2 = p; }
}
