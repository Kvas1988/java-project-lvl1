package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gameNumber = 0;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice: ");


        if (sc.hasNextInt()) { // check if input is Int
            gameNumber = sc.nextInt(); // get input from user
        }

        System.out.print("\n");


        String username = "";
        switch (gameNumber) {
            case 1:
                username = Cli.getUsername();
                break;
            case 2:
                username = Cli.getUsername();
                EvenGame.startEvenGame(username);
                break;
            default:
                break;
        }
    }
}
