package exam06.models.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberDao memberDao;

    private final JoinValidator validator;


    public void join(Member member) {
        validator.check(member);

        memberDao.register(member);
    }

}
