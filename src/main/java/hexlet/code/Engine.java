package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {

    public static void startGame(Game game) {
        String username = Cli.getUsername();
        game.printRule();

        final int maxCorrectAnswers = 3;
        Scanner sc = new Scanner(System.in);
        int numOfCorrectAnswers = 0;
        boolean isCorrectAnswer = true;

        // game loop
        while (isCorrectAnswer) {

            // generate question
            Object correctAnswer = game.generateQuestionAndAnswer();

            // input
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            // check answer
            isCorrectAnswer = game.checkAnswer(answer, correctAnswer);
            if (isCorrectAnswer) {
                numOfCorrectAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\nLet's try again, " + username + "!");
            }

            if (numOfCorrectAnswers == maxCorrectAnswers) {
                System.out.println("Congratulations, " + username + "!");
                return;
            }
        }
    }
}
