package exam05;

import java.util.ArrayList;

public class FruitBox<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public ArrayList<T> get(){
        return items;
    }
}
