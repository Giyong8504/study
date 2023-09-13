package com.koreait.mdels.member;

import com.koreait.commons.Role;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data @Builder
public class MemberInfo implements UserDetails {

    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private Role role;
    private Collection<GrantedAuthority> authorities; // 권한에 대한 내용

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //회원에 대한 권한, 통제
        return authorities;
    }

    @Override
    public String getPassword() { // 회원쪽 DB에서 가져와 해결하면됨.
        return userPw;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() { //만료
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() { // 탈퇴여부
        return true;
    }
}
