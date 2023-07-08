package exam02;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 100;
//        Integer integer = new Integer(num1);
//        integer.doubleValue(); //이렇게하면 되는데 너무 귀찮다 매번
        
        Integer num2 = num1; //알아서 대입해줌. Integer.valueOf(num1)// ; 컴파일러가 자동 변환
        //Integer 박스안에 100이 담겨있다. --> 오토박싱 해준거. 컴파일러가 포장해줌.
        
        int num3 = num1 + num2; // num.intValue() -> int
        // Integer에 있는 100을 꺼낸다. -> 언박싱 컴파일러가 자동으로.

    }
}
