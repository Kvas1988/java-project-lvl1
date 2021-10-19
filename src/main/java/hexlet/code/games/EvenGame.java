package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class EvenGame {

    public static String getRule() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String[] generateQuestionAndAnswer() {
        final int maxNumber = 100;
        int randomNumber = (int) (Math.random() * maxNumber);
        String question = "Question: " + randomNumber;

        String answer = randomNumber % 2 == 0 ? "yes" : "no";

        return new String[] {question, answer};
    }


    public static void generateAndRunGame() {
        String[][] questions = new String[App.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }
}
