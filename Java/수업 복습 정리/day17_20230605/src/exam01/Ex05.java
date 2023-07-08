package exam01;

import java.util.StringTokenizer;

public class Ex05 {
    public static void main(String[] args) {
        //StringTokenizer : , 를 기준으로 잘라줌.
        String fruits = "Apple,Mango#Banana_Melon";
        StringTokenizer st = new StringTokenizer(fruits,",#"); //,#_ 도 인식함.
        while (st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
