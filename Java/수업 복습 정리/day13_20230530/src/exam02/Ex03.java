package exam02;

public class Ex03 {
    public static void main(String[] args) {

        try {
            String str = null;
            str = str.toUpperCase(); //throw new NullPointerException(....);

            //null 값이면 던져서 아래에 실행이 안되고 catch 문에서 받는다.
            //str null 이면 절대로 실행되면 안되는 코드
            System.out.println("str 값이 반드시 있어야 정상 실행되는 소스");


        }catch(NullPointerException e){ //NulPointerException e = new NulPointerException(...)
           //System.out.println("적절한 예외 처리...");
           // String message = e.getMessage(); *****굉장히 많이 사용할거임. 반드시 기억해둘것.
          //  System.out.println(message);
            e.printStackTrace(); // *****굉장히 많이 사용할거임. 반드시 기억해둘것.
        }
        System.out.println("매우 중요한 코드!!");
    }//예외처리를 함으로써 어떤 오류가 있는지 확인할 수 있는 방법.
}
