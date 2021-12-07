package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.entity.Member;

public interface MemberService extends GeneralService<Member> {
    Member updateMemberScore(String memberId, Integer score);
    void deleteMember(String memberId);
}
