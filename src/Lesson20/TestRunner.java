package Lesson20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws IllegalAccessException {
        int executedTests = 0;
        int failedTests = 0;

        Method[] declaredMethods = ArithmeticTest.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(null);
                } catch (InvocationTargetException e) {
                    failedTests++;
                    Throwable cause = e.getCause();
                    System.out.printf("Execution of test %s failed with exception %s, %s%n",
                            method.getName(), cause.getClass(), cause.getMessage());
                }
                executedTests++;
            }
        }
        System.out.printf("Executed tests: %d, failed tests: %d%n", executedTests, failedTests);
    }
}
