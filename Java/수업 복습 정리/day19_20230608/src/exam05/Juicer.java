package exam05;

import java.util.ArrayList;

public class Juicer<T> {
    private T item;
    public static void make(FruitBox<? extends Fruit>appleBox){
        ArrayList<?> items = appleBox.get();
        System.out.println(items);
    }

//    public static <T extends Fruit> void make2(FruitBox<T> fruitBox){
//        ArrayList<T> items =fruitBox.get();
//        System.out.println(items);
//    }



//    public static void make(FruitBox<? super Apple>fruitBox){ //? Apple , Fruit, Object
//        ArrayList<?> items = fruitBox.get();
//        System.out.println(items);
//    }


//    public static void make(FruitBox<Melon>melonBox){
//        ArrayList<Melon> items = melonBox.get();
//        System.out.println(items);
//    }  중복정의로 오류남.
    // ? 사용  -> 와일드 카드
}
