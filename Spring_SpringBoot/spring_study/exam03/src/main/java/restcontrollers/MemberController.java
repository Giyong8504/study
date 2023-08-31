package restcontrollers;

import controllers.member.JoinForm;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberDao memberDao;
    private final JoinService joinService;


    //객체를 반환 한다. 중요! json에서 다 해준다.
    @GetMapping("/{id}")
    public ResponseEntity<JSONData<Member>> info(@PathVariable("id") String userId) {
        Member member = memberDao.get(userId);
        JSONData<Member> data = new JSONData<>();
        data.setSuccess(true);
        data.setData(member);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/list")
    public List<Member> list() {
        List<Member> members = memberDao.getList();

        return members;
    }

    /*
    @GetMapping("/hello")
    public String hello() {

        return "Hello!!";
    }
       */
    @GetMapping("/hello")
    public void hello() {
        System.out.println("Hello!!");
    }
    /*
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody JoinForm form) {

        joinService.join(form);

       *//* return ResponseEntity.status(HttpStatus.CREATED).build();
        //json이니까 객체로 반환하고 status()로 상태를 반환 한 것. build() 는 바디 출력 x *//*

        //return ResponseEntity.status(HttpStatus.CREATED).body(form);
        //body에 출력하면 내용이 보이게 된다.


        return ResponseEntity.created(URI.create("/member/login")).build();
    }
    */

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody @Valid JoinForm form, Errors errors, HttpServletResponse response) {



        if (errors.hasErrors()) {
            String messages = errors.getAllErrors()
                    .stream().map(o -> o.getDefaultMessage())
                    .collect(Collectors.joining(","));

            throw new RuntimeException(messages);
        }

            joinService.join(form); // DuplicateMemberException -> CommonException

            return ResponseEntity.created(URI.create("/member/login")).build();

    }


}
