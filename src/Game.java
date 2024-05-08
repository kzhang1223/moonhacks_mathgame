import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    private Quiz quiz;
    private Player p1;
    private Player p2;
    private Scanner input;

    public Game() {
        // initialize here
        input = new Scanner(System.in);
        System.out.println("Welcome to math. Would you like to play a game?");
        runApplication();
    }

    private void runApplication() {
        String command;
        
        while (true) {
            command = input.next();
            command = command.toLowerCase();
            if (command.equals("yes")) {
                continueWithGame();
            } else {
                System.out.println("Okay then, I suppose this is goodbye... for now.");
                break;
            }
        }
    }

    private void continueWithGame() {
        System.out.println("Yippee! The rules are simple. Two players. Do the math and whoever finishes first wins. However... if your score is lower even if you finished first... you will still lose. So be careful out there!");
        System.out.println("First of all, player 1 enter your name.");

        String player1name = input.next();
        p1 = new Player(player1name, 0);

        System.out.println("Alright, now player 2 enter your name.");

        String player2name = input.next();
        p2 = new Player(player2name, 0);

        System.out.println(player1name + ", " + player2name + ", it is time to start the game! How many questions would you like to race with?");
        String numQuestions = input.next();

        quiz = new Quiz(p1, p2, Integer.parseInt(numQuestions));

        System.out.println("Ok, " + numQuestions + " questions, " + player1name + ", you will be going first!");

        quiz.createQuiz();
        startGame();
    }

    private void startGame() {
        for (int x = 3; x > 0; x--) {
            System.out.println(Integer.toString(x));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch(InterruptedException e) {
                System.out.println("Waiting is too hard...");
            }
        }

        System.out.println("Start!!");
        
        actualGame(p1);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
            System.out.println("Waiting is too hard...");
        }

        System.out.println("Good job! Your time now " + p2.name + "!");

        for (int x = 3; x > 0; x--) {
            System.out.println(Integer.toString(x));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch(InterruptedException e) {
                System.out.println("Waiting is too hard...");
            }
        }

        actualGame(p2);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch(InterruptedException e) {
            System.out.println("Waiting is too hard...");
        }

        endGame();
    }

    void actualGame(Player p) {
        long questionTime = 0;
        for (Question q : quiz.questions) {

            long startTime = System.currentTimeMillis();
            System.out.println(q.toString());
            String playerAnswer = input.next();
            long endTime = System.currentTimeMillis();
            
            questionTime += (endTime - startTime);
            p.answers.add(playerAnswer);
        }
        p.time = questionTime;
    }

    void endGame() {
        System.out.println("Good job everyone! Let me tabulate the score now...");
        quiz.calculateScore(p1);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch(InterruptedException e) {
            System.out.println("Waiting is too hard...");
        }
        System.out.println("Almost done!");
        quiz.calculateScore(p2);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch(InterruptedException e) {
            System.out.println("Waiting is too hard...");
        }

        // // for testing 
        // for (int x = 0; x < quiz.numQuestions; x++) {
        //     System.out.println("Quiz: " + Integer.toString(quiz.answers.get(x)) + " Player " + p1.answers.get(x));
        // }


        System.out.println("Alright! The results are in... " + p1.name + " you got a score of " + Integer.toString(p1.score) + ".");
        System.out.println(p2.name + " you got a score of " + Integer.toString(p2.score) + ".");
        if (p1.score > p2.score) {
            System.out.println("Congrats " + p1.name + " you have won!");
            System.out.println("Ending game now... Good-bye!");
            System.exit(0);
        } else if (p1.score < p2.score) {
            System.out.println("Congrats " + p2.name + " you have won!");
            System.out.println("Ending game now... Good-bye!");
            System.exit(0);
        } else {
            System.out.println("Hm... it seems we have a tie... No worry! Let us take a look at the time y'all took to finish the quiz");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch(InterruptedException e) {
                System.out.println("Waiting is too hard...");
            }
            System.out.println(p1.name + " your time was " + Long.toString(p1.time));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch(InterruptedException e) {
                System.out.println("Waiting is too hard...");
            }
            System.out.println(p2.name + " your time was " + Long.toString(p2.time));

            if (p1.time > p2.time) {
                System.out.println("Hooray! " + p1.name + " you have won!");
                System.out.println("Ending game now... Good-bye!");
                System.exit(0);
            } else if (p1. time < p2.time) {
                System.out.println("Hooray! " + p2.name + " you have won!");
                System.out.println("Ending game now... Good-bye!");
                System.exit(0);
            } else {
                System.out.println("Welp... I guess you guys are simply too equal :D. Bye-bye...");
                System.exit(0);
            }
        }
    }
}
