package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression  {

    private static final String RULE = "What number is missing in the progression?";

    public static String getRule() {
        return RULE;
    }

    public static String[] generateQuestionAndAnswer() {
        // generate length of progression
        int numsInProgression = Utils.generateRandomIntBetween(Utils.PROGRESSION_MIN_LEN, Utils.PROGRESSION_MAX_LEN);

        // generate progression and hide one element
        int[] progression = generateProgression(numsInProgression);
        int hiddenNumIndex = Utils.generateRandomInt(progression.length - 1);
        int hiddenNum = progression[hiddenNumIndex];

        // output
        String question = buildQuestion(progression, hiddenNumIndex);

        return new String[] {question, Integer.toString(hiddenNum)};
    }

    public static void generateAndRunGame() {
        String[][] questions = new String[Engine.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }

    private static int[] generateProgression(int numsInProgression) {
        int[] progression = new int[numsInProgression];

        int firstNum = Utils.generateRandomInt(Utils.PROGRESSION_MAX_FIRST_NUM);
        progression[0] = firstNum;
        int add = Utils.generateRandomIntBetween(1, Utils.PROGRESSION_MAX_ADD);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + add;
        }

        return progression;
    }

    private static String buildQuestion(int[] progression, int hiddenNumIndex) {
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenNumIndex) {
                outputBuilder.append("..");
            } else {
                outputBuilder.append(progression[i]);
            }

            if (i != progression.length - 1) {
                outputBuilder.append(" ");
            }
        }
        return outputBuilder.toString();
    }
}
