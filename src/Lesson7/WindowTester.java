package Lesson7;

import Lesson7.Window;

public class WindowTester {

    public static void main(String[] args) {
        Window javaWindow = new Window (10,30, "White");

        System.out.println("Window colour is: " + javaWindow.colour);

        javaWindow.open();
        if (javaWindow.isOpened()){
            System.out.println("We checked - it is open");
        } else {
            System.out.println("We checked - it is closed");
        }
        javaWindow.close();
        if (javaWindow.isOpened()){
            System.out.println("We checked - it is open");
        } else {
            System.out.println("We checked - it is closed");
        }
    }
}
