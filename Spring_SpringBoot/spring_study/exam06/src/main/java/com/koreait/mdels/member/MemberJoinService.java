package com.koreait.mdels.member;

import com.koreait.controllers.member.JoinForm;
import com.koreait.controllers.member.JoinValidator;
import com.koreait.entities.Member;
import com.koreait.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
@RequiredArgsConstructor
public class MemberJoinService {

    private final MemberRepository repository;
    private final JoinValidator joinValidator;
    private final PasswordEncoder encoder;

    public void join(JoinForm form, Errors errors) {
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) {
            return;
        }


        Member member = new ModelMapper().map(form, Member.class);
        member.setUserPw(encoder.encode(form.getUserPw())); // 비밀번호 해시화

        repository.saveAndFlush(member);
    }
}
