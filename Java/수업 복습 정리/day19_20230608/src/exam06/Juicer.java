package exam06;

import java.util.ArrayList;

public class Juicer {
    public static void make(FruitBox<? extends Fruit> fruitBox){
        ArrayList<?> items = fruitBox.get();
        System.out.println(items);
    }
}
