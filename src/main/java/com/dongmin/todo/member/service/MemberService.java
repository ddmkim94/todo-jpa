package com.dongmin.todo.member.service;

import com.dongmin.todo.member.entity.Member;
import com.dongmin.todo.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member join(Member member) {
        memberRepository.save(member);
        return member;
    }
}
