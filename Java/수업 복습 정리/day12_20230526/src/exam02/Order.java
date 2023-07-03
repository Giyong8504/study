package exam02;

public class Order implements Buy, Sell {
    public void buy() {
        System.out.println("구매!!");
    }

    @Override
    public void order() {
       // Sell.super.order();
        System.out.println("주문!");
    }

    public void sell() {
        System.out.println("판매!!");
    }
}
