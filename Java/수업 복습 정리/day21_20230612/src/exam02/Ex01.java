package exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "사용자 01");
        members.put("user02", "사용자 02");
        members.put("user03", "사용자 03");

        members.put("user02", "(수정)사용자 02"); //이미 있는 key 값에 대입하면 바뀜~

//        members.remove("user02"); // key 값을 가지고 삭제 가능.
//
//        String userNm = members.get("user02"); //key 값으로 value 조회
//        System.out.println(userNm);

        for(Map.Entry<String, String> entry : members.entrySet()) {  //우회적으로 키값이 집합인데 map.entry도 집합.
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value =%s%n", key , value);
        }

        for(String key : members.keySet())  {
            String value = members.get(key);
            System.out.printf("key=%s, value =%s%n", key , value);
        }

        /**  // 이거 잘 안씀...
        Set<Map.Entry<String, String>> entrySet = members.entrySet();
        Iterator<Map.Entry<String,String>> iter = entrySet.iterator();

        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            //getKey(), getValue()
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("Key=%s, value =%s/%s", key , value);
        }
         */

    }
}
