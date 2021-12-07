package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.dto.member.MemberCreateReq;
import fpt.trainining.movietheatre.dto.member.MemberUpdateScoreReq;
import fpt.trainining.movietheatre.service.mapper.MemberMapper;
import fpt.trainining.movietheatre.entity.Member;
import fpt.trainining.movietheatre.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    @Autowired private MemberService memberService;
    @Autowired private MemberMapper memberMapper;

    @GetMapping
    public ResponseEntity findAll() {
        List<Member> members = (List<Member>) memberService.findAll();
        return ResponseHandler.generateResponse("Find all members successfully!", HttpStatus.OK, members);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody MemberCreateReq memberCreateReq) {
        Member member = memberMapper.memberCreateReqToMember(memberCreateReq);
        Member result = memberService.save(member);
        return ResponseHandler.generateResponse("Create member successfully!", HttpStatus.CREATED, result);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id){
        Member member = memberService.findById(id);
        return ResponseHandler.generateResponse("Find member successfully!", HttpStatus.OK, member);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateMemberScore(@PathVariable String id, @RequestBody MemberUpdateScoreReq memberUpdateScoreReq) {
        Member member = memberService.updateMemberScore(id, memberUpdateScoreReq.getScore());
        return ResponseHandler.generateResponse("Update member's score successfully!", HttpStatus.OK, member);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        memberService.deleteMember(id);
        return ResponseHandler.generateResponse("Delete successfully!", HttpStatus.OK, null);
    }
}
