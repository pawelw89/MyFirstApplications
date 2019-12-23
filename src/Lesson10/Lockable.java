package Lesson10;

public interface Lockable {
    static final boolean LOCKED = false;

    void lock();

    void unlock();
}
