package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers")
public class CommonController { //공통적인 에러 페이지를 넣어둔 곳.
    @ExceptionHandler(Exception.class) //발생할 예외를 넣어준다.
    public String errorHandler(Exception e, Model model) { // 어떤 에러인지 알려주자.
        e.printStackTrace();
        model.addAttribute("message", e.getMessage());
        return "error/common";
    }

}
