package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {

    private static final String RULE = "Answer 'yes' if number even otherwise answer 'no'.";

    public static String getRule() {
        return RULE;
    }

    public static String[] generateQuestionAndAnswer() {
        int randomNumber = Utils.generateRandomInt(Utils.EVEN_GAME_MAX_NUMBER);
        String answer = randomNumber % 2 == 0 ? "yes" : "no";

        return new String[] {Integer.toString(randomNumber), answer};
    }


    public static void generateAndRunGame() {
        String[][] questions = new String[App.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }
}
