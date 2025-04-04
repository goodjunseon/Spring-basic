package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository; // 추상화에만 의존,

    @Autowired // ac.getBean(MemberRepository.clas) -> 의존관계 주입을 자동으로 해줌
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository; // 생성자 주입 방법
    }

    @Override
        public void join(Member member) {
            memberRepository.save(member);
        }

        @Override
        public  Member findMember(Long memberId) {
            return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
