package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinServlet extends HttpServlet {
    @Override
    public void destroy() { // 24시간 계속 돼야하기 때문에 해제를 안하면 계속 쌓여서 메모리가 부족해진다.
        // 자원 해제
        System.out.println("destroy!");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s",key1,key2);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<form method='post' action='join'>");
        out.print("아이디 : <input type='text' name='userId'><br>");
        out.print("비밀번호 : <input type='password' name='userPw'><br>");
        out.print("비밀번호확인 : <input type='password' name='userPwRe'><br>");
        out.print("회원명 : <input type=text' name='userNm'><br>");
        out.print("취미: ");
        out.print("<input type='checkbox' name='hobby' value='축구'>축구");
        out.print("<input type='checkbox' name='hobby' value='야구'>야구");
        out.print("<input type='checkbox' name='hobby' value='독서'>독서");
        out.print("<button type='submit'>가입하기</button>");
        out.print("</form>");

        System.out.println("doGet()!");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // content-type : application/x-www-form-urlencoded
        // 6.0 도 알려줘야 한글이 안깨진다.
        req.setCharacterEncoding("UTF-8");
        String userId = req.getParameter("userId");
        String userPw = req.getParameter("userPw");
        String userPwRe = req.getParameter("userPwRe");
        String userNm = req.getParameter("userNm");
        String[] hobbies = req.getParameterValues("hobby"); //해보면 체크박스 하나만 생성되니 String[] 배열로 사용해야한다.

        System.out.printf("userId=%s, userPw=%s, userPwRe=%s, userNm=%s%n", userId,userPw,userPwRe,userNm);
        System.out.println(Arrays.toString(hobbies));
    }
}