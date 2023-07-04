package exam01;

public class UserIdIncorrectException extends Exception { // 상속받아서 던질 수 있다.
    public UserIdIncorrectException(String message) {
        super(message); //상위 클래스 생성자쪽으로 던지면 된다.
    }
    //Throwable 로 던져도 되지만 Error(통제불가) 와 Exception 을 둘다 포함하고있어
    // Exception 을 사용하는게 좋다.
// 상위클래스로 던져서 상위클래스가 처리하도록 한다. super 사용해서 상위 클래스 생성자로 던진다.
}
