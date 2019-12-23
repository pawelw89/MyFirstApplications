package Lesson15Hometask;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }
}
