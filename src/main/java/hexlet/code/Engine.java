package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class Engine {

    public static void startGame(int gameNumber) {

        String username = Cli.getUsername();
        printRule(gameNumber);

        final int maxCorrectAnswers = 3;
        Scanner sc = new Scanner(System.in);
        int numOfCorrectAnswers = 0;
        boolean isCorrectAnswer = true;

        // game loop
        while (isCorrectAnswer) {

            // generate question
            Object correctAnswer = generateQuestionAndAnswer(gameNumber);

            // input
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            // check answer
            isCorrectAnswer = checkAnswer(gameNumber, answer, correctAnswer);
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

    private static boolean checkAnswer(int gameNumber, String answer, Object correctAnswer) {
        boolean result;
        switch (gameNumber) {
            case App.EVEN_NUM:
                result = EvenGame.checkAnswer(answer, correctAnswer);
                break;
            case App.CALC_NUM:
                result = Calculator.checkAnswer(answer, correctAnswer);
                break;
            case App.GCD_NUM:
                result = GreatestCommonDivisor.checkAnswer(answer, correctAnswer);
                break;
            case App.PROGRESSION_NUM:
                result = Progression.checkAnswer(answer, correctAnswer);
                break;
            case App.PRIME_NUM:
                result = Prime.checkAnswer(answer, correctAnswer);
                break;
            default:
                result = false;
                break;
        }

        return result;
    }

    private static Object generateQuestionAndAnswer(int gameNumber) {
        Object answer;
        switch (gameNumber) {
            case App.EVEN_NUM:
                answer = EvenGame.generateQuestionAndAnswer();
                break;
            case App.CALC_NUM:
                answer = Calculator.generateQuestionAndAnswer();
                break;
            case App.GCD_NUM:
                answer = GreatestCommonDivisor.generateQuestionAndAnswer();
                break;
            case App.PROGRESSION_NUM:
                answer = Progression.generateQuestionAndAnswer();
                break;
            case App.PRIME_NUM:
                answer = Prime.generateQuestionAndAnswer();
                break;
            default:
                answer = null;
                break;
        }

        return answer;
    }

    private static void printRule(int gameNumber) {
        switch (gameNumber) {
            case App.EVEN_NUM:
                EvenGame.printRule();
                break;
            case App.CALC_NUM:
                Calculator.printRule();
                break;
            case App.GCD_NUM:
                GreatestCommonDivisor.printRule();
                break;
            case App.PROGRESSION_NUM:
                Progression.printRule();
                break;
            case App.PRIME_NUM:
                Prime.printRule();
                break;
            default:
                break;
        }
    }
}
