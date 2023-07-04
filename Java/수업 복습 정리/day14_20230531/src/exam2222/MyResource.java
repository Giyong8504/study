package exam2222;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("자원해제 됐다");

    }
}
