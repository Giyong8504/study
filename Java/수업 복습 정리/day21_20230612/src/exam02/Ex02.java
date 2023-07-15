package exam02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder()); //다형성으로 Map으로 바꿈. 이걸더 많이 씀.
        members.put("user03", "사용자 03");
        members.put("user01", "사용자 01");
        members.put("user02", "사용자 02");

        for(Map.Entry<String, String> entry : members.entrySet()) {  //우회적으로 키값이 집합인데 map.entry도 집합.
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value =%s%n", key , value);
        }
    }
}
