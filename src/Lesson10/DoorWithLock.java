package Lesson10;

public class DoorWithLock extends Door implements Lockable, Paintable, Windowed{

    private boolean locked;

    private String colour;

    @Override
    public void lock() {
        locked = true;
        System.out.println("Door has been locked");
    }

    @Override
    public void unlock() {
        locked = false;
        System.out.println("Door has been unlocked");
    }

    @Override
    public void paint(String colour) {
        this.colour = colour;
        System.out.println("Door has been painted out in " + colour + " colour");
    }

    public boolean isLocked() {
        return locked;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void openWindow() {

    }

    @Override
    public void closeWindow() {

    }
}