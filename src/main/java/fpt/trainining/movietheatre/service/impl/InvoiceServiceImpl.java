package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.invoice.InvoiceReq;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Invoice;
import fpt.trainining.movietheatre.entity.Member;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.InvoiceRepository;
import fpt.trainining.movietheatre.service.AccountService;
import fpt.trainining.movietheatre.service.InvoiceService;
import fpt.trainining.movietheatre.service.MemberService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final AccountService accountService;
    private final MemberService memberService;
    private final ModelMapper mapper;

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice findById(String id) {
        return invoiceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot found invoice"));
    }

    @Override
    public List<Invoice> findByAccountId(String accountId) {
        return invoiceRepository.findByAccountId(accountId);
    }

    @Override
    public Invoice create(InvoiceReq invoiceReq) {
//        Invoice invoice = mapper.map(invoiceReq, Invoice.class);
//        Member member = memberService.
//        if (invoiceReq.getIsUseScore().equals(0)) {
//            invoice.setAccount(account);
//            return invoiceRepository.save(invoice);
//        } else {
//
//        }

        return new Invoice();
    }
}
