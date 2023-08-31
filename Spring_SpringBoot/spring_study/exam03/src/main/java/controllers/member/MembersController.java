package controllers.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MembersController {

    private final MemberDao memberDao;


    @GetMapping
    public String list(@ModelAttribute @Valid SearchForm form, Errors errors) { //객체가 없어도 알아서 만들어줌 @ModelAttribute
        System.out.println(form);
        return "member/list";
    }

    @GetMapping("/info/{id}")
    public String info(@PathVariable("id") String userId) { //변수명이 달라도 주입을 해주면 알아서 해준다.
        System.out.println("userId : " + userId);

        boolean result = false;
        if (!result) {
            throw new RuntimeException("★예외가 발생....!!!");
        }
        return "member/info";
    }

    @ResponseBody //json 에서 응답과 처리
    @GetMapping("/members2")
    public List<Member> members2() {
        List<Member> members = memberDao.getList();

        return members;

    }
}