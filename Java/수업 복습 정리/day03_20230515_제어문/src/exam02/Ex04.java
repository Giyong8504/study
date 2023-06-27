package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String medal = "금메달";
        switch(medal){
            case "금메달" :
                System.out.println("GOLD");
                break;
            case "은메달" :
                System.out.println("SILVER");
                break;
            case "동메달" :
                System.out.println("BRONZE");
                break;
            default:
                System.out.println("No Medal");
        }
    }
}
