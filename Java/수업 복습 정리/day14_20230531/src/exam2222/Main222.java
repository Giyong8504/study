package exam2222;

import java.io.IOException;

public class Main222 {
    public static void main(String[] args) {

        try(MyResource mr = new MyResource()){

        }catch(Exception e) {
            e.printStackTrace();

        }

    }
}
