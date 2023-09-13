package com.koreait.configs;

import com.koreait.mdels.member.MemberInfo;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // auth.getPrincipal();
        // 1. 미로그인 상태 String : anonymousUser
        // 2. 로그인 상태 UserDetails 구현 객체

        String userId = null;
        if (auth != null && auth.getPrincipal() instanceof UserDetails) {
            MemberInfo member = (MemberInfo)auth.getPrincipal();
            userId = member.getUserId();
        }

        return Optional.ofNullable(userId);
    }
}
