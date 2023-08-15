package exam02;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex03 {
    public static void main(String[] args) throws MalformedURLException { //입력한 주소가 확실한지 예외가 발생함.
        URL url = new URL("https://n.news.naver.com/mnews/article/003/0011928375?sid=105#footer");


        String protocol = url.getProtocol();
        String host = url.getHost();
        String path = url.getPath();
        String query = url.getQuery();
        String ref = url.getRef();

        System.out.printf("protocol=%s, host=%s, path=%s, query=%s,ref=%s%n",protocol,host,path,query,ref);

    }
}
