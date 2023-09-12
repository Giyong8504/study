package com.koreait.commons;

import com.koreait.mdels.member.MemberInfo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtil { //여기서 조회를 한꺼번에 할 수 있도록 하자.

    private final HttpSession session;

    public boolean isLogin() {
        return getMember() != null;
    }

    public MemberInfo getMember() {
        MemberInfo member = (MemberInfo)session.getAttribute("memberInfo");

        return member;
    }

}
