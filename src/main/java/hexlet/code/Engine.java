package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void startGame(String[][] rulesAndQuestions) {

        String username = Cli.getUsername();

        // print rule
        System.out.println(rulesAndQuestions[0][0]);

        final int maxCorrectAnswers = App.RULES_AND_QUESTIONS_NUM - 1;
        Scanner sc = new Scanner(System.in);
        int numOfCorrectAnswers = 0;

        // game loop
        for (int i = 1; i < rulesAndQuestions.length; i++) {

            String question = rulesAndQuestions[i][0];
            String correctAnswer = rulesAndQuestions[i][1];

            // print question
            System.out.println(question);

            // input
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            // check answer
            if (answer.equals(correctAnswer)) {
                numOfCorrectAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\nLet's try again, " + username + "!");

                return;
            }

            // check answerNums
            if (numOfCorrectAnswers == maxCorrectAnswers) {
                System.out.println("Congratulations, " + username + "!");
                return;
            }
        }
    }
}
