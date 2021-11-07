package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.NoSuchElementException;

public class Calculator {

    private static final String RULE = "What is the result of the expression?";
    private static final String[] OPERATORS = {"-", "+", "*"};

    public static String getRule() {
        return RULE;
    }

    public static String[] generateQuestionAndAnswer() throws NoSuchElementException {
        int num1 = Utils.generateRandomInt(Utils.CALC_MAX_NUMBER);
        int num2 = Utils.generateRandomInt(Utils.CALC_MAX_NUMBER);

        String operator = OPERATORS[Utils.generateRandomInt(OPERATORS.length)];
        String question = num1 + " " + operator + " " + num2;

        int answer = switch (operator) {
            case "-" -> num1 - num2;
            case "+" -> num1 + num2;
            case "*" -> num1 * num2;
            default -> throw new NoSuchElementException("Unknown operator:" + operator);
        };

        return new String[] {question, Integer.toString(answer)};
    }

    public static void generateAndRunGame() {
        String[][] questions = new String[Engine.QUESTIONS_NUM][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = generateQuestionAndAnswer();
        }

        Engine.startGame(getRule(), questions);
    }
}

