package com.koreait.mdels.member;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        HttpSession session = request.getSession();
        session.removeAttribute("requiredUserId");
        session.removeAttribute("requiredUserPw");
        session.removeAttribute("globalError");
        session.removeAttribute("userId");

        /*로그인 회원 정보 처리*/
        MemberInfo memberInfo = (MemberInfo)authentication.getPrincipal(); // MemberUtil 클래스 확인
        session.setAttribute("memberInfo",memberInfo);

        response.sendRedirect(request.getContextPath() + "/");
    }
}
