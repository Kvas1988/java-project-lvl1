package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Calculator {

    public static String getRule() {
        return "What is the result of the expression?";
    }

    public static String[] generateQuestionAndAnswer() {
        final int maxNumber = 10;
        int num1 = (int) (Math.random() * maxNumber);
        int num2 = (int) (Math.random() * maxNumber);

        char[] operators = {'-', '+', '*'};
        char operator = operators[(int) (Math.random() * operators.length)];
        String question = "Question: " + num1 + " " + operator + " " + num2;

        int answer;
        if (operator == '-') {
            answer = num1 - num2;
        } else if (operator == '+') {
            answer = num1 + num2;
        } else { // *
            answer = num1 * num2;
        }

        return new String[] {question, Integer.toString(answer)};
    }

    public static void generateAndRunGame() {
        String[][] questions = new String[App.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }
}

