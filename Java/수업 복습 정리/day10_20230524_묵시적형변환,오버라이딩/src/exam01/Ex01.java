package exam01;

public class Ex01 {
    public static void main(String[] args) {
//        C c = new C();
        A a = new C();

        A ad = new D();

        if(ad instanceof C) {
            C c = (C)ad;
        }else{
            System.out.println("출처가 같지 않음");
        }

            C c2 = (C)a;
            System.out.printf("numA=%d, numB=%d, numC=%d%n",c2.numA,c2.numB,c2.numC);

    }
}
