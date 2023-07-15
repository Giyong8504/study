package exam02;

import java.util.*;

public class Ex09 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs,"abc","def","ghi");
        System.out.println(strs);

        List<String> alpahs = Arrays.asList("A","A","A","B","C" );
        int frequency = Collections.frequency(alpahs,"A");
        System.out.println(frequency);
    }
}
