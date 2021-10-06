package hexlet.code;

import java.util.Scanner;

class App {

    static final int GREET_NUM = 1;
    static final int EVEN_NUM = 2;
    static final int CALC_NUM = 3;
    static final int GCD_NUM = 4;
    static final int PROGRESSION_NUM = 5;
    static final int PRIME_NUM = 6;
    static final int EXIT_NUM = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int gameNumber = 0;

        StringBuilder selectGameOutput = new StringBuilder("Welcome to the Brain Games!\n");
        selectGameOutput.append("Please enter the game number and press Enter.\n");
        selectGameOutput.append(GREET_NUM + " - Greet\n");
        selectGameOutput.append(EVEN_NUM + " - Even\n");
        selectGameOutput.append(CALC_NUM + " - Calculator\n");
        selectGameOutput.append(GCD_NUM + " - GCD\n");
        selectGameOutput.append(PROGRESSION_NUM + " - Progression\n");
        selectGameOutput.append(PRIME_NUM + " - Prime\n");
        selectGameOutput.append(EXIT_NUM + " - Exit\n");
        selectGameOutput.append("Your choice: ");
        System.out.print(selectGameOutput.toString());


        if (sc.hasNextInt()) { // check if input is Int
            gameNumber = sc.nextInt(); // get input from user
        }

        System.out.print("\n");


        if (gameNumber == GREET_NUM) {
            String username = Cli.getUsername();
        } else  if (gameNumber == EXIT_NUM) {
            return;
        } else {
            Engine.startGame(gameNumber);
        }
    }
}
