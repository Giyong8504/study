package exam03;

import java.util.HashSet;

public class Ex03 {
    public static void main(String[] args) {
        HashSet<Integer> lottos = new HashSet<>();
        while(lottos.size() < 6) {
            int num = (int)Math.random() *45 + 1; //1~45
            lottos.add(num);
            System.out.println(lottos);
        }

    }
}
