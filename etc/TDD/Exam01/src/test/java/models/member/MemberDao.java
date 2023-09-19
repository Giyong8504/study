package models.member;


import java.util.HashMap;
import java.util.Map;

public class MemberDao {
    private Map<String, Member> members = new HashMap<>();
    public void add(Member member) {
        String userId = member.getUserId();
        members.put(userId,member);
    }

    public boolean exists(String userId) {
        return members.containsKey(userId);
    }
}
