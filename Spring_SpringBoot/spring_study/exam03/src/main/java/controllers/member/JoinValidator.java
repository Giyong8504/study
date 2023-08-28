package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(JoinForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        JoinForm joinForm = (JoinForm)target;

        /*
        * 1. 필수 항목 검증 (userId, userPw, userPwRe, userNm), null, "   "  null값과 빈값으로 에러를 처리하면된다.
        *
        * */
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "required");

    }
}
