package Lesson20Hometask;

public class AnnotatedClass {

    public void firstMethod() {
        System.out.println("Execution of the first method");
    }
    @Execute()
    public void secondMethod(String text) {
        System.out.println("Execution of second method with text " + text);
    }
    @Execute(times = 10)
    public void thirdMethod(String text, Integer number) {
        System.out.println("Execution of third method with text " + text + " and number " + number);
    }

}
