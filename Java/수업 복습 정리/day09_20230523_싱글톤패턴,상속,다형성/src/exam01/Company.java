package exam01;

public class Company {

    private static Company instance; // null 값으로 만들어두고

    private Company(){

    }
    //static 메서드를 사용하여 객체에 접근하려면 생성된 객체에도 공유 할 수 있도록 static을 사용해야한다.
    public static Company getInstance() {
        //값이 없으면 기본적으로 null 값이니 getInstance를 호출하게 되면 if 문으로 null 일때 생성하게 만듬.
        if(instance == null) { // 객체가 생성되지 않은 경우
            instance = new Company();
        }
        return instance;
    }
}
