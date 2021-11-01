package hexlet.code;

public class Utils {
    // TODO Put functions with generation of random numbers here
    public static final int PROGRESSION_MIN_LEN = 5;
    public static final int PROGRESSION_MAX_LEN = 10;
    public static final int PROGRESSION_MAX_FIRST_NUM = 20;
    public static final int PROGRESSION_MAX_ADD = 20;
    public static final int CALC_MAX_NUMBER = 10;
    public static final int EVEN_GAME_MAX_NUMBER = 100;
    public static final int GCD_MAX_NUMBER = 50;
    public static final int PRIME_MAX_NUMBER = 50;

    public static int generateRandomInt(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }

    public static int generateRandomIntBetween(int minNumber, int maxNumber) {
        return generateRandomInt(maxNumber - minNumber) + minNumber;
    }
}
