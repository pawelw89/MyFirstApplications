package Lesson15;

public class Util {

    public static <T extends Number> boolean  ecompare(T first, T second) {
        return first.equals(second);
    }

    public static <T extends Number> T getOrDeafault(T a, T b) {
        if (a != null) {
            return a;
        } else {
            return b;
        }
    }
    public static <T extends Number> T max(T a, T b){
        if (a.byteValue() > b.byteValue()) {
            return a;
        } else {
            return b;
        }

    }
}
