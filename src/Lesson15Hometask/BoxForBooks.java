package Lesson15Hometask;

public class BoxForBooks<B> {
    private B books;

    public BoxForBooks(B books) {
        this.books = books;
    }

    B getItem() {
        return books;
    }
}
