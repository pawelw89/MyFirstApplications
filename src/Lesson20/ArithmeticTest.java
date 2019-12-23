package Lesson20;

public class ArithmeticTest {
    @Test
    public static void testOne() {
        int i = 0;
        i = i / i;
    }

    public static void testTwo() {
        System.out.println("Test two has been ran");
    }

    @Test
    public static void testThree() {
        System.out.println("Test three has been ran");
    }
}
