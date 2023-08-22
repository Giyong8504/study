package exam06.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private MemberDao memberDao;

    private JoinValidator validator;

    public JoinService(MemberDao memberDao, JoinValidator validator) {
        this.memberDao = memberDao;

        this.validator = validator;
    }

    public void join(Member member) {
        validator.check(member);

        memberDao.register(member);
    }

}
