package exam04;

public class MyResource implements AutoCloseable {
    //AutoCloseable 구현체이고 close가 정의되면 문제가 없을 것.
    @Override
    public void close() throws Exception {
        System.out.println("자원 해제!!!");

    }
    //ALT + Enter

}
