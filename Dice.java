import java.util.*;

public class Dice {
    public static int roll() {
        return new Random().nextInt(6) + 1;
    }
}