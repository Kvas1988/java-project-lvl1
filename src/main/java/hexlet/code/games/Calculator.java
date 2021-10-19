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
        String[][] rulesAndQuestions = new String[App.RULES_AND_QUESTIONS_NUM][2];

        rulesAndQuestions[0] = new String[] {getRule(), null};

        for (int i = 1; i < rulesAndQuestions.length; i++) {
            rulesAndQuestions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(rulesAndQuestions);
    }
}

