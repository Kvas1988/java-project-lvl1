package hexlet.code.games;

public class EvenGame {

    public static void printRule() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static Object generateQuestionAndAnswer() {
        final int maxNumber = 100;
        int randomNumber = (int) (Math.random() * maxNumber);
        System.out.println("Question: " + randomNumber);

        return randomNumber % 2 == 0 ? "yes" : "no";
    }

    public static boolean checkAnswer(String userAnswer, Object correctAnswer) {
        return userAnswer.equals(correctAnswer);
    }
}
