package hexlet.code.games;

public class Calculator {

    public static void printRule() {
        System.out.println("What is the result of the expression?");
    }

    public static Object generateQuestionAndAnswer() {
        final int maxNumber = 10;
        int num1 = (int) (Math.random() * maxNumber);
        int num2 = (int) (Math.random() * maxNumber);

        char[] operators = {'-', '+', '*'};
        char operator = operators[(int) (Math.random() * operators.length)];
        System.out.println("Question: " + num1 + " " + operator + " " + num2);

        int answer;
        if (operator == '-') {
            answer = num1 - num2;
        } else if (operator == '+') {
            answer = num1 + num2;
        } else { // *
            answer = num1 * num2;
        }

        return answer;
    }

    public static boolean checkAnswer(String userAnswer, Object correctAnswer) {
        int userAnswerInt = Integer.parseInt(userAnswer);
        int correctAnswerInt = (int) correctAnswer;
        return userAnswerInt == correctAnswerInt;
    }
}

