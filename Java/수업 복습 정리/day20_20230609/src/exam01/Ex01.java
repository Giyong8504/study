package exam01;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이이름");
        names.add("김이름");
        names.add("박이름");
        names.add("최이름");

//        for(int i = 0; i < names.size(); i++){
//            String name = names.get(i);
//
//            System.out.println(name);
//        }

        for(String name : names){
            System.out.println(name);
        }
    }
}
