package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 요청 컨트롤러
@RequestMapping("/member/join") // 정보에 대해 handle
public class MemberJoinController {
    @GetMapping // /member/join
//    @RequestMapping(method = RequestMethod.GET, path="/member/join")
    public String join() {
        return "member/join";
    }

    //처리에 대한 맵핑
    @PostMapping //  /member/join
    public String joinPs(@RequestParam(name="userId", required = false) String memId, String userPw, boolean agree) {
        System.out.printf("userId=$s, userPw=$s$n, agree=%s%n", memId, userPw, agree);

        return null;
    }
}