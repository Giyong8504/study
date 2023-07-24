package exam04;

public class Order implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void sell() {
        System.out.println("판매!");
    }
}
