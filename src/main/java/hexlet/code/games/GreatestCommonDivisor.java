package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class GreatestCommonDivisor  {
    public static String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[] generateQuestionAndAnswer() {
        final int maxNumber = 50;
        int num1 = (int) (Math.random() * maxNumber);
        int num2 = (int) (Math.random() * maxNumber);
        String question = "Question: " + num1 + " " + num2;

        int answer = euclidianGreatesCommonDivisor(num1, num2);
        return new String[] {question, Integer.toString(answer)};
    }

    public static void generateAndRunGame() {
        String[][] questions = new String[App.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }

    private static int findGreatesCommonDivisor(int num1, int num2) {
        int gcd = 1;

        int max = Math.max(num1, num2);
        for (int i = 2; i <= max; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    private static int euclidianGreatesCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }

        return euclidianGreatesCommonDivisor(b % a, a);
    }
}
