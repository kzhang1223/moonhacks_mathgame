import java.util.Scanner;

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
    }
}
