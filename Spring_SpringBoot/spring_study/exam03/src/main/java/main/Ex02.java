package main;

import config.AppCtx;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberDao memberDao = ctx.getBean(MemberDao.class);

        List<Member> members = memberDao.getList();
        members.stream().forEach(System.out::println);

        System.out.println("==============개별 조회 ================");
        Member member = memberDao.get("user06");
        System.out.println(member);

        long total = memberDao.getTotal();
        System.out.println("전체 회원수 : " + total);

        ctx.close();
    }
}
