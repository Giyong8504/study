package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.naver.com");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoInput(true);

        StringBuffer sb = new StringBuffer(10000);
        try (InputStream in = conn.getInputStream();
             InputStreamReader isr = new InputStreamReader(in, "UTF-8"); //UTF-8로 한글이 안깨지게됨
             BufferedReader br = new BufferedReader(isr)) {

            String line = null;
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        System.out.println(sb.toString());

    }
}
