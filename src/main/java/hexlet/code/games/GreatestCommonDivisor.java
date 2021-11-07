package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisor  {

    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static String getRule() {
        return RULE;
    }

    public static String[] generateQuestionAndAnswer() {
        int num1 = Utils.generateRandomInt(Utils.GCD_MAX_NUMBER);
        int num2 = Utils.generateRandomInt(Utils.GCD_MAX_NUMBER);
        String question = num1 + " " + num2;

        int answer = euclidianGreatesCommonDivisor(num1, num2);
        return new String[] {question, Integer.toString(answer)};
    }

    public static void generateAndRunGame() {
        String[][] questions = new String[Engine.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }


    private static int euclidianGreatesCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }

        return euclidianGreatesCommonDivisor(b % a, a);
    }
}
