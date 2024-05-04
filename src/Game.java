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

        System.out.println("Ok, " + numQuestions + " questions, let's see who comes out on top!");

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
    }
}
