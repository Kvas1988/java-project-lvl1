package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void startEvenGame(String username) {

        final int maxNumber = 100;
        final int maxCorrectAnswers = 3;

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        // game loop
        Scanner sc = new Scanner(System.in);
        int correctAnswers = 0;
        boolean isCorrectAnswer = true;

        while (isCorrectAnswer) {
            int randomNumber = (int) (Math.random() * maxNumber);
            System.out.print("Question: " + randomNumber + "\nYour answer: ");

            // input yes or no
            // check other types
            String answer = sc.nextLine();
            if (randomNumber % 2 == 0) { // even
                if (answer.equals("yes")) {
                    correctAnswers++;
                    System.out.println("Correct!");
                } else {
                    isCorrectAnswer = false;
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.\n"
                            + "Let's try again, " + username + "!");
                }
            } else { // odd
                if (answer.equals("no")) {
                    correctAnswers++;
                    System.out.println("Correct!");
                } else {
                    isCorrectAnswer = false;
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.\n"
                            + "Let's try again, " + username + "!");
                }
            }

            if (correctAnswers == maxCorrectAnswers) {
                System.out.println("Congratulations, " + username + "!");
                return;
            }
        }
    }
}
