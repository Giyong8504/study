package exam02;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] inetAddresses = InetAddress.getAllByName("naver.com");
        Arrays.stream(inetAddresses).forEach(s->System.out.println(s.getHostAddress()));
    }
}
