package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GreatestCommonDivisor;

import java.util.Scanner;

class App {

    public static void main(String[] args) {

        final int greetNum = 1;
        final int evenNum = 2;
        final int calcNum = 3;
        final int gcdNum = 4;
        final int exitNum = 0;

        Scanner sc = new Scanner(System.in);
        int gameNumber = 0;

        StringBuilder selectGameOutput = new StringBuilder("Welcome to the Brain Games!\n");
        selectGameOutput.append("Please enter the game number and press Enter.\n");
        selectGameOutput.append(greetNum + " - Greet\n");
        selectGameOutput.append(evenNum + " - Even\n");
        selectGameOutput.append(calcNum + " - Calculator\n");
        selectGameOutput.append(gcdNum + " - GCD\n");
        selectGameOutput.append(exitNum + " - Exit\n");
        selectGameOutput.append("Your choice: ");
        System.out.println(selectGameOutput.toString());


        if (sc.hasNextInt()) { // check if input is Int
            gameNumber = sc.nextInt(); // get input from user
        }

        System.out.print("\n");


        String username = "";
        switch (gameNumber) {
            case greetNum:
                username = Cli.getUsername();
                break;
            case evenNum:
                Engine.startGame(new EvenGame());
                break;
            case calcNum:
                Engine.startGame(new Calculator());
            case gcdNum:
                Engine.startGame(new GreatestCommonDivisor());
            default:
                break;
        }
    }
}
