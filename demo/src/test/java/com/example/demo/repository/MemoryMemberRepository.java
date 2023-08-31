package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import com.example.demo.domain.Member;

class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();
    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        System.out.println("result = " + (result == member));
    }


}
