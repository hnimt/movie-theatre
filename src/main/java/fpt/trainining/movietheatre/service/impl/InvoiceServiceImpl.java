package fpt.trainining.movietheatre.service.impl;

import fpt.trainining.movietheatre.dto.invoice.InvoiceReq;
import fpt.trainining.movietheatre.entity.Account;
import fpt.trainining.movietheatre.entity.Invoice;
import fpt.trainining.movietheatre.exception.ResourceNotFoundException;
import fpt.trainining.movietheatre.repository.InvoiceRepository;
import fpt.trainining.movietheatre.service.AccountService;
import fpt.trainining.movietheatre.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final AccountService accountService;
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
    public Invoice create(InvoiceReq invoiceReq) {
        Invoice invoice = mapper.map(invoiceReq, Invoice.class);
        Account account = accountService.findById(invoiceReq.getAccountId());
        invoice.setAccount(account);
        return invoiceRepository.save(invoice);
    }
}
