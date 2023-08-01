package models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Users {
    private long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private LocalDateTime regDt;
    private LocalDateTime modDt;

}
