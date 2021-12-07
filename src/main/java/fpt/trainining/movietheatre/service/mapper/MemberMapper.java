package fpt.trainining.movietheatre.service.mapper;

import fpt.trainining.movietheatre.dto.member.MemberCreateReq;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Member;
import fpt.trainining.movietheatre.entity.common.Roles;
import fpt.trainining.movietheatre.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {
    @Autowired private ModelMapper mapper;
    @Autowired private AccountService accountService;

    public Member memberCreateReqToMember (MemberCreateReq memberCreateReq) {
        Member member = mapper.map(memberCreateReq, Member.class);
        Account account = accountService.updateRole(memberCreateReq.getAccountId(), Roles.MEMBER.getRoleName());
        member.setAccount(account);
        return member;
    }
}
