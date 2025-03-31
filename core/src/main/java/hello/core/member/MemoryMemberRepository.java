package hello.core.member;

import java.util.HashMap;
import java.util.Map;


// 로컬 기반 DB 저장소 -> 서버를 껏다 키면 사라짐 ㅋㅋ 나중에 DB 연결할꺼임!
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
