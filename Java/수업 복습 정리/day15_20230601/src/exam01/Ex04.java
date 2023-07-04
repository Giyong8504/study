package exam01;

public class Ex04 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("exam01.Student");

        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
