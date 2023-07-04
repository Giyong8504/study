package exam04;

public class Ex01 {
    public static void main(String[] args) {//안에 있는 타입이 autoCloseable 있으면 "try with resources 문" 사용이가능.
        try(MyResource myResource = new MyResource()) {

        }catch (Exception e) {
            e.printStackTrace();
        }
        //try ~ with resource 구문 AutoCloseable 구현객체의 close 메서드를 예외가 있던 없던간에 마지막에 close() 메서드 호출!
        //거의 모든 거 다 쓸 수 있음.
    }
}
