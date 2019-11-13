package Lesson7;

public class Window {
    int width;
    int height;
    String colour;
    boolean opened;

    Window(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
        opened=false;
    }

    void open() {
        opened = true;
        System.out.println("The window is opened");
    }

    void close() {
        opened = false;
        System.out.println("The window is closed");
    }

    boolean isOpened () {
        return opened;
    }
}