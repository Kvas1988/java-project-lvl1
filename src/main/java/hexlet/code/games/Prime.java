package hexlet.code.games;

public class Prime  {
    public final void printRule() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public final Object generateQuestionAndAnswer() {
        final int maxNumber = 50;
        int num = (int) (Math.random() * maxNumber);
        System.out.println("Question: " + num);

        return isPrime(num);
    }

    public final boolean checkAnswer(String userAnswer, Object correctAnswer) {
        return userAnswer.equals(correctAnswer);
    }

    private String isPrime(int n) {
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
