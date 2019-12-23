package Lesson10;

public abstract class Door {
    private boolean opened;

    public void open() {
        opened = true;
        System.out.println("Door has been opened");
    }

    public void close() {
        opened = false;
        System.out.println("Door has been closed");
    }

    public boolean isOpened() {
        return opened;
    }
}
