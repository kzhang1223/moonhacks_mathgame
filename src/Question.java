// Each instance of a Question class represents the simple mathematical equation with its 2 numbers (for now) and
// operation. It also has a string that represents the math equation. This will be mainly used for printing to console
// in the beginning.
public class Question {
    int a;
    int b;
    String operation;
    String question;

    public Question(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    @Override
    public
    String toString() {
        String astr = Integer.toString(a);
        String bstr = Integer.toString(b);
        question = astr + " " + operation + " " + bstr + " = ?";
        return question;
    }

    // getters and setters
    int getA() { return a; }
    int getB() { return b; }
    String getOperation() { return operation; }
    String getQuestion() { return question; }

    void setA(int a) { this.a = a; }
    void setB(int b) { this.b = b; }
    void setOperation(String operation) { this.operation = operation; }
}
