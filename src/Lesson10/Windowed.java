package Lesson10;

import java.io.Serializable;

public interface Windowed extends Serializable, Cloneable {
    void openWindow();
    void closeWindow();

    default void breakWindow() {
        System.out.println("Window has been broken");
    }

    static void cleanWindow() {

    }
}
