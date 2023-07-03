package exam02;

public interface Buy {
    void buy(); // public abstract

    default void order() {
        System.out.println("Buy - 주문!");
    }
}
