//package hello.hellospring.service;
//
//import hello.hellospring.domain.Member;
////import hello.hellospring.repository.MemoryMemberRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@Transactional
//class MemberServiceTest {
//
//    MemberService memberService;
//
//    MemoryMemberRepository memberRepository;
//
//    @BeforeEach
//    public void beforeEach() {
//        memberRepository = new MemoryMemberRepository();
//        memberService = new MemberService(memberRepository);
//    }
//
//    @AfterEach
//    public void afterEach() {
//        memberRepository.clearStore();
//    }
//
//    @Test
//    void join() {
//        // given
//        Member member = new Member();
//        member.setName("spring");
//
//        // when
//        Long saveId = memberService.join(member);
//
//        // then
//        Member findMember = memberService.findOne(saveId).get();
//        assertThat(member.getName()).isEqualTo(findMember.getName());
//    }
//
//    @Test
//    public void duplicatedMemberCheck() {
//        // given
//        Member member1 = new Member();
//        member1.setName("spring");
//
//        Member member2 = new Member();
//        member2.setName("spring");
//
//        // when
//        memberService.join(member1);
//        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
//
//        assertThat(e.getMessage()).isEqualTo("You can't use this name.");
////        try {
////            memberService.join(member2);
////            fail();
////        } catch (IllegalStateException e) {
////            assertThat(e.getMessage()).isEqualTo("You can't use this name.");
////        }
//        // then
//    }
//
//    @Test
//    void findMembers() {
//    }
//
//    @Test
//    void findOne() {
//    }
//}