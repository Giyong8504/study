package homeWork;

public class H6 {
    //A 자동차와 B자동차는 서로 같은 도착 지점을 향해 가고 있습니다.
    //A 자동차는 최초 60km/h속도로 이동하다가 한시간마다 10km/h씩 속력을 높이고 있고
    //B 자동차는 최초 40km의 속도로 이동하다가 한시간마다 15km/h씩 속력을 높이고 있습니다.
    //A 자동차와 B 자동차가 최초로 만나는 지점(km)를 구하시오.

        public static void main(String[] args) {
            int initialSpeedA = 60; // A 자동차의 초기 속도 (km/h)
            int speedIncrementA = 10; // A 자동차의 속도 증가량 (km/h)
            int initialSpeedB = 40; // B 자동차의 초기 속도 (km/h)
            int speedIncrementB = 15; // B 자동차의 속도 증가량 (km/h)

            int meetingPoint = findMeetingPoint(initialSpeedA, speedIncrementA, initialSpeedB, speedIncrementB);
            System.out.println("최초로 만나는 지점: " + meetingPoint + " km");
        }

        private static int findMeetingPoint(int initialSpeedA, int speedIncrementA, int initialSpeedB, int speedIncrementB) {
            int distanceA = 0; // A 자동차의 이동 거리
            int distanceB = 0; // B 자동차의 이동 거리
            int meetingPoint = 0; // 최초로 만나는 지점

            int time = 0; // 시간
            while (distanceA != distanceB) {
                distanceA = (initialSpeedA + (speedIncrementA * time)) * time;
                distanceB = (initialSpeedB + (speedIncrementB * time)) * time;
                time++;
            }

            meetingPoint = distanceA;

            return meetingPoint;
        }


}
