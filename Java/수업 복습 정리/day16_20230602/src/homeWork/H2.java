package homeWork;

import java.util.Scanner;

public class H2 {
    //세 값을 입력 받아 그 3개 값 중 최대값을 구하시오.
    //세 값을 입력 받기 위해서는 java.util.Scanner 클래스를 활용할 것

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("값 입력 : ");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int value3 = scanner.nextInt();

        int maxValue = getMaxValue(value1, value2, value3);
        System.out.println("최대값: " + maxValue);
    }

    public static int getMaxValue(int value1, int value2, int vlaue3) {
        int max = value1;

        if (value2 > max) {
            max = value2;
        }

        if (vlaue3 > max) {
            max = vlaue3;
        }

        return max;
    }
}
