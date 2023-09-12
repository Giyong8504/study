package com.koreait.controllers.member;

import com.koreait.commons.MemberUtil;
import com.koreait.mdels.member.MemberInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/mypage")
@RequiredArgsConstructor
public class MypageController {

    private final MemberUtil memberUtil;

    @GetMapping
    @ResponseBody

    public void index() { // 로그인 여부를 여기다가 따로 만들어서 편리하게 사용하는 것
        log.info("로그인 여부 : " + memberUtil.isLogin());
        if (memberUtil.isLogin()) {
            MemberInfo member = memberUtil.getMember();
            log.info(member.toString());
        }
    }

    /*
    public void index() { //
        MemberInfo member = (MemberInfo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        log.info(member.toString());
    }*/


    /*
    public void index(@AuthenticationPrincipal MemberInfo member) { //훨씬 많은 정보가 입력되어 있다.
        log.info(member.toString());
    }
    */

    /*
    public void index(Principal principal) {
        String userId = principal.getName(); //현재 로그인한 사용자의 아이디를 확인할 수 있다. 잘 안씀.
        log.info(userId);
        */

}

