package Lesson15Hometask;

public class BoxForToys<T> {

        private T toy;

        public BoxForToys(T toy) {
            this.toy = toy;
        }

        T getItem() {
            return toy;
        }

}
