package exam02;

import java.text.ChoiceFormat;

public class Ex05 {
    public static void main(String[] args) {
//        double[] limits = {60,70, 80, 90};
//        String[] grades = {"D","C","B","A"};
//        String pattern = "60#D|70#C|80#B|90#A"; //간단하게 한꺼번에쓴것.
        String pattern = "60#D|70#C|80<B|90#A"; //80은 경계값 81점~89점  -> B


        int[] scores = {90,95,52,62,75,80,85};
//        ChoiceFormat form = new ChoiceFormat(limits, grades);
        ChoiceFormat form = new ChoiceFormat(pattern);

        for(int score : scores) {
            System.out.printf("점수 : %d, 학점 : %s%n",score,form.format(score)); //형식화해서 원래 문자열로.
        }
    }
}
