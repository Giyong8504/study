package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class JoinServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
//        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.print("<form method='post' action='join'>");
        out.print("아이디 : <input type='text' name='userId'<br>");
        out.print("비밀번호 : <input type='password' name='userPw'<br>");
        out.print("비밀번호 확인 : <input type='password' name='userPwPe'><br>");
        out.print("회원명 : <input type='text' name='userNm'><br>");
        out.print("<button type='submit'> 가입하기</button>");
        out.print("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String userPw = req.getParameter("userPw");
        System.out.printf("userId=%s , userPw=%s%n",userId,userPw);

    }
}
