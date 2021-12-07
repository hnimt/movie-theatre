package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.member.MemberReq;
import fpt.trainining.movietheatre.dto.member.MemberRes;

import java.util.List;

public interface MemberService {
    List<MemberRes> findAll();
    MemberRes findById(String id);
//    MemberRes findMemberByName();
    MemberRes createMember(MemberReq req);
    MemberRes updateMember(String id, MemberReq req);
    void deleteById(String id);
}
