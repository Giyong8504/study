package exam02;

import java.util.List;
import java.util.function.Consumer;

public class Stream2 {
    private static Stream2 stm = null;
    private List<String> items;
    public static Stream2 stream(List<String>items){
        stm = new Stream2();
        stm.items = items;

        return stm;

    }
    public void forEach(Consumer<String> consumer){
        for(String item : items){
            consumer.accept(item);
        }
    }
}
