package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Prime  {
    public static String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[] generateQuestionAndAnswer() {
        final int maxNumber = 50;
        int num = (int) (Math.random() * maxNumber);
        String question = "Question: " + num;

        return new String[] {question, isPrime(num)};
    }

    public static void generateAndRunGame() {
        String[][] rulesAndQuestions = new String[App.RULES_AND_QUESTIONS_NUM][2];

        rulesAndQuestions[0] = new String[] {getRule(), null};

        for (int i = 1; i < rulesAndQuestions.length; i++) {
            rulesAndQuestions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(rulesAndQuestions);
    }

    private static String isPrime(int n) {
        if (n <= 1) {
            return "no";
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
