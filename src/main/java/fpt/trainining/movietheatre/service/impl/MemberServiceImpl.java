package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.entity.Member;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.MemberRepository;
import fpt.trainining.movietheatre.service.AccountService;
import fpt.trainining.movietheatre.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired private MemberRepository memberRepository;
    @Autowired private AccountService accountService;

    @Override
    public Collection<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member findById(Object id) {
        return memberRepository.findById((String) id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot found member id: " + id));
    }

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public void remove(Object id) {
        memberRepository.deleteById((String) id);
    }

    @Override
    public Member updateMemberScore(String memberId, Integer score) {
        Member member = findById(memberId);
        member.setScore(score);
        return save(member);
    }

    @Override
    @Transactional
    public void deleteMember(String memberId) {
        Member member = findById(memberId);
        accountService.remove(member.getAccount().getAccountId());
        remove(memberId);
    }
}
