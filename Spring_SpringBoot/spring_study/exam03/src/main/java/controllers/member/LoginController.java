package controllers.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginValidator loginValidator;
    private final LoginService loginService;

    @GetMapping
    public String login(@ModelAttribute LoginForm loginForm, @CookieValue(name="saveId", required = false) String userId) { // 자동으로 쿠키를 넘겨줌
        if (userId != null) { // 커맨드 객체로 넘겨서 자동 체크.
            loginForm.setSaveId(true);
            loginForm.setUserId(userId);
        }

        return "member/login";
    }

    @PostMapping
    public String loginPs(@Valid LoginForm loginForm, Errors errors) {

        loginValidator.validate(loginForm, errors);

        if (errors.hasErrors()) {
            return "member/login";
        }

        loginService.login(loginForm);

        return "redirect:/";
    }
}