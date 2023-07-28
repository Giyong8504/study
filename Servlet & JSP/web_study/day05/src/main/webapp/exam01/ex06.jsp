<%@ page contentType="text/html; charset=UTF-8" %>
<form method="POST" action="ex06_ps.jsp" >
    아이디 : <input type="text" name="userId"><br>
    비밀번호 : <input type="password" name="userPw"><br>
    비밀번호 확인 : <input type="password" name="userPwRe"><br>
    회원명 : <input type="text" name="userNm"><br>
    취미 :
          <input type="checkbox" name="hobby" value="야구">야구
          <input type="checkbox" name="hobby" value="축구">축구
          <input type="checkbox" name="hobby" value="농구">농구
    <button type="submit">가입하기</button>
</form>
