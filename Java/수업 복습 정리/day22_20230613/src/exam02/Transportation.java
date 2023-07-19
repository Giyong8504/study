package exam02;

public enum Transportation {
    //static final
    BUS(1250){
        @Override
        public String getName() {
            return "버스";
        }
    },
    SUBWAY(1250){
        @Override
        public String getName() {
            return "지하철";
        }
    },
    TAXI(4500){
        @Override
        public String getName() {
            return "택시";
        }
    };

    private int fare;

    Transportation(int fare) {
        this.fare = fare; // 위에도 정의해야한다.
    }

    public int getTotal(int personNum) {
        return fare * personNum;
    }
    public abstract String getName(); // Enum 클래스는 추상클래스였따.

}
