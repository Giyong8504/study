package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        LinkedList<String> names = new LinkedList<>();//추가 삭제를 위해 했는데 다헀을때? ▼
        List<String> names = new ArrayList<>(); //다형성을 이용해 유연하게 사용.
        //앞에는 주로 상위 인터페이스로List를 쓰고 쉽게 ArrayList(), LinkedList()로 쉽게 변경가능하다.
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Iterator<String> iter = names.iterator(); //얘는 길어서 사실 for문으로.. 근데 향상된for문도 어 짧게 쓸 수 있다.
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("-----------------");

        while(iter.hasNext()){  // 한번 반복을 다하면 종료해서 재활용이 안된다. 그럼? 다시 만들어야함.
            String name = iter.next();
            System.out.println(name);
        }
        iter = names.iterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("-----------------");


//        for(int i = 0; i<names.size(); i++){
//            names.remove(i); // 0번째가 지워지면 배열을 다시 만든다.
            // 그럼 0번은 했으니 1번이 삭제되면서 이름3이 삭제된다.
            //같은 방법으로 삭제되어 이름2, 이름4만 남는다. (깔끔하게 제거 안됨.)
            // 해결 방법 뒤에서부터 삭제하면 순서가 바뀌지 않고 삭제 가능하다.(배열은 뒤에서 부터 삭제해!!!)
//        }

        //이게 해결방안~~
//        for(int i = names.size()-1; i >= 0; i --){
//            names.remove(i);
//        }
//
//        for(String name : names){
//            System.out.println(name);
//        }
        //이름2 이름4가 남는다. 이유는?

        // Array는 끝에서 먼저 추가하는게 효율적으로 추가하는 것 (stack 구조를 생각하자!!)

    }
}
