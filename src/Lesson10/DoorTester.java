package Lesson10;

public class DoorTester {

    public static void main(String[] args) {
        DoorWithLock door = new DoorWithLock();
        System.out.println(door.isOpened());
        door.open();
        System.out.println(door.isOpened());

        System.out.println(door.isLocked());
        door.unlock();
        System.out.println(door.isLocked());

        System.out.println(door.getColour());
        door.paint("White");
        System.out.println(door.getColour());
        door.setColour("Black");
        System.out.println(door.getColour());
    }
}
