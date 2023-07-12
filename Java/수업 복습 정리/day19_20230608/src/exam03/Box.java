package exam03;

public class Box<T extends Fruit> { //Fruit , Apple , Melon
    private T item; //Fruit

    public void put(T item){ //Fruit
        this.item = item;
    }

    public T get() { //Fruit
        return item;
    }

    public void showInfo() {
        item.showInfo();
    }
}
