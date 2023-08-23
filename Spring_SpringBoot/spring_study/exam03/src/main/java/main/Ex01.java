package main;

import config.AppCtx;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberDao memberDao = ctx.getBean(MemberDao.class);
        Member member = Member.builder()
                        .userId("user01")
                        .userPw("123456")
                        .userNm("사용자01")
                        .build();

        boolean result = memberDao.register(member);
        System.out.println(result);

        ctx.close();
    }
}
