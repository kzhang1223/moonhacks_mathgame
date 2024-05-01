// Each instance of a Question class represents the simple mathematical equation with its 2 numbers (for now) and
// operation. It also has a string that represents the math equation. This will be mainly used for printing to console
// in the beginning.
public class Question {
    int a;
    int b;
    char operation;
    String question;

    public Question(int a, int b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    void toString(int a, int b, char operation) {
        String astr = Integer.toString(a);
        String bstr = Integer.toString(b);
        question = astr + " " + operation + " " + bstr;
    }

    // getters and setters
    int getA() { return a; }
    int getB() { return b; }
    char getOperation() { return operation; }
    String getQuestion() { return question; }

    void setA(int a) { this.a = a; }
    void setB(int b) { this.b = b; }
    void setOperation(char operation) { this.operation = operation; }
}
