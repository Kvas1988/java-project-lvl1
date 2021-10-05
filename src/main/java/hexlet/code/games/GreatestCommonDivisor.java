package hexlet.code.games;

public class GreatestCommonDivisor implements Game {
    public final void printRule() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public final Object generateQuestionAndAnswer() {
        final int maxNumber = 50;
        int num1 = (int) (Math.random() * maxNumber);
        int num2 = (int) (Math.random() * maxNumber);
        System.out.println("Question: " + num1 + " " + num2);

        return euclidianGreatesCommonDivisor(num1, num2);
    }

    public final boolean checkAnswer(String userAnswer, Object correctAnswer) {
        int userAnswerInt = Integer.parseInt(userAnswer);
        int correctAnswerInt = (int) correctAnswer;
        return userAnswerInt == correctAnswerInt;
    }

    private int findGreatesCommonDivisor(int num1, int num2) {
        int gcd = 1;

        int max = Math.max(num1, num2);
        for (int i = 2; i <= max; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    private int euclidianGreatesCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }

        return euclidianGreatesCommonDivisor(b % a, a);
    }
}
