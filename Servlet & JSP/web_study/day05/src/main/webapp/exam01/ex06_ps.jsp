<%@ page contentType="text/html; charset=UTF-8" %>
아이디 : ${param.userId}<br>
비밀번호 : ${param['userPw']}<br>
비밀번호 확인 : ${param.userPwRe}<br>
회원명 : ${param.userNm}<br>
취미 : ${paramValues.hobby[0]} ${paramValues.hobby[1]} ${paramValues.hobby[2]}<br>
User-Agent : ${header['User-Agent']}<br>
JSESSIONID : ${cookie.JSESSIONID.getValue()}<br>
JSESSIONID : ${cookie.JSESSIONID.value}<br>
