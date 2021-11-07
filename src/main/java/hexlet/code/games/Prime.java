package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime  {

    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String getRule() {
        return RULE;
    }

    public static String[] generateQuestionAndAnswer() {
        int num = Utils.generateRandomInt(Utils.PRIME_MAX_NUMBER);
        String answer = isPrime(num) ? "yes" : "no";
        return new String[] {Integer.toString(num), answer};
    }

    public static void generateAndRunGame() {
        String[][] questions = new String[Engine.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
