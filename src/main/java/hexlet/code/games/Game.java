package hexlet.code.games;

public interface Game {
    void printRule();
    Object generateQuestionAndAnswer();
    boolean checkAnswer(String userAnswer, Object correctAnswer);
}
