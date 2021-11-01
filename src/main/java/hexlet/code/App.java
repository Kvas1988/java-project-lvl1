package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {

    static final String GREET_NUM = "1";
    static final String EVEN_NUM = "2";
    static final String CALC_NUM = "3";
    static final String GCD_NUM = "4";
    static final String PROGRESSION_NUM = "5";
    static final String PRIME_NUM = "6";
    static final String EXIT_NUM = "0";

    public static final int QUESTIONS_NUM = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String gameNumber = "0";

        StringBuilder menu = new StringBuilder("Welcome to the Brain Games!\n")
                .append("Please enter the game number and press Enter.\n")
                .append(GREET_NUM + " - Greet\n")
                .append(EVEN_NUM + " - Even\n")
                .append(CALC_NUM + " - Calculator\n")
                .append(GCD_NUM + " - GCD\n")
                .append(PROGRESSION_NUM + " - Progression\n")
                .append(PRIME_NUM + " - Prime\n")
                .append(EXIT_NUM + " - Exit\n")
                .append("Your choice: ");
        System.out.print(menu.toString());

        gameNumber = sc.next(); // get input from user

        System.out.print("\n");
        switch (gameNumber) {
            case GREET_NUM -> {
                String username = Cli.getUsername();
            }
            case EVEN_NUM -> EvenGame.generateAndRunGame();
            case CALC_NUM -> Calculator.generateAndRunGame();
            case GCD_NUM -> GreatestCommonDivisor.generateAndRunGame();
            case PROGRESSION_NUM -> Progression.generateAndRunGame();
            case PRIME_NUM -> Prime.generateAndRunGame();
            default -> { }
        }
    }
}
