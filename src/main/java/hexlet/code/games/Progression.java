package hexlet.code.games;

public class Progression implements Game {

    public final void printRule() {
        System.out.println("What number is missing in the progression?");
    }

    public final Object generateQuestionAndAnswer() {
        // generate length of progression
        final int minNumsInProgression = 5;
        final int maxNumsInProgression = 10;
        int numsInProgression = (int) ((Math.random() * (maxNumsInProgression - minNumsInProgression))
                + minNumsInProgression);

        // generate progression and hide one element
        int[] progression = generateProgression(numsInProgression);
        int hiddenNumIndex = (int) (Math.random() * (progression.length - 1));
        int hiddenNum = progression[hiddenNumIndex];

        // output
        StringBuilder outputBuilder = new StringBuilder("Question: ");
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
        System.out.println(outputBuilder);

        return hiddenNum;
    }

    public final boolean checkAnswer(String userAnswer, Object correctAnswer) {
        int userAnswerInt = Integer.parseInt(userAnswer);
        int correctAnswerInt = (int) correctAnswer;
        return userAnswerInt == correctAnswerInt;
    }

    private int[] generateProgression(int numsInProgression) {
        int[] progression = new int[numsInProgression];

        final int maxFirstNum = 20;
        final int maxAdd = 10;

        int firstNum = (int) (Math.random() * maxFirstNum);
        progression[0] = firstNum;
        int add = (int) (Math.random() * (maxAdd - 1) + 1);

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + add;
        }

        return progression;
    }
}
