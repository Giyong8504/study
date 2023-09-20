package member;

public class JoinService {

    private MemberDao memberDao;
    private JoinValidator validator;

    public JoinService(MemberDao memberDao, JoinValidator validator) {
        this.memberDao = memberDao;
        this.validator = validator;
    }

    public void join(Member member) {

        validator.check(member);

       if (memberDao.exists(member.getUserId())) {
           throw new DuplicateUserIdException();
       }

       memberDao.add(member);
    }
}
