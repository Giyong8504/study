package controllers.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member/join")
@RequiredArgsConstructor
public class MemberJoinController {

    @Autowired
    private final JoinValidator joinValidator;
    @GetMapping // /member/join
    public String join(@ModelAttribute JoinForm joinForm, Model model) {
        // 커맨드 객체 @ModelAttribute 을 사용하면 알아서 바로 위의 주석의 내용을 알아서 추가 해준다.

        commonProcess(model);

        return "member/join2";
    }

    @PostMapping
    public String joinPs(JoinForm form, Errors errors, Model model) { //에러는 커먼객체 바로 뒤에 있어야함.

        commonProcess(model);

        joinValidator.validate(form, errors);

        if(errors.hasErrors()) { // reject, rejectValue -> true
            return "member/join2";
        }

        return "redirect:/member/login";
    }

    private void commonProcess(Model model) {
        List<Item> hobbies = getHobbies();
        model.addAttribute("hobbies", hobbies);

        List<Item> types = getMemberTypes();
        model.addAttribute("types", types);
    }

    private List<Item> getMemberTypes() {
        List<Item> types = Arrays.asList(
                new Item("개인회원", "private"),
                new Item("사업자회원", "company")
        );

        return types;
    }

    private List<Item> getHobbies() {
        List<Item> hobbies = Arrays.asList(
                new Item("자바", "JAVA"),
                new Item("JSP", "JSP"),
                new Item("스프링", "SPRING"),
                new Item("스프링부트", "SPRINGBOOT")
        );

        return hobbies;
    }

    /*
    private List<String> getHobbies() {
        List<String> hobbies = Arrays.asList("자바", "JSP", "스프링", "스프링부트");

        return hobbies;
    }
    */
    /*
    @PostMapping // /member/join
    public String joinPs(@RequestParam(name="userId", required = false, defaultValue="없는 아이디") String memId, String userPw, boolean agree) {
       System.out.printf("userId=%s, userPw=%s, agree=%s%n", memId, userPw, agree);


        return null;
    }

     */

}