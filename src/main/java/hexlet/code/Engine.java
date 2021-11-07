package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int QUESTIONS_NUM = 3;

    public static void startGame(String rule, String[][] questions) {

        String username = Cli.getUsername();

        // print rule
        System.out.println(rule);

        Scanner sc = new Scanner(System.in);

        // game loop
        for (int i = 0; i < questions.length; i++) {

            String question = questions[i][0];
            String correctAnswer = questions[i][1];

            // print question
            System.out.println("Question: " + question);

            // input
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            // check answer
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\nLet's try again, " + username + "!");

                return;
            }
        }

        System.out.println("Congratulations, " + username + "!");
    }
}
