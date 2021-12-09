package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.dto.invoice.InvoiceReq;
import fpt.trainining.movietheatre.entity.Invoice;
import fpt.trainining.movietheatre.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/invoice")
@AllArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity getAll(@RequestParam(name = "account_id", required = false) String accountId) {
        List<Invoice> res = null;
        if (accountId != null) {
            res = invoiceService.findByAccountId(accountId);
        } else {
            res = invoiceService.findAll();
        }
        return ResponseHandler.generateResponse("Get invoices successfully!", HttpStatus.OK, res);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody InvoiceReq req) {
        Invoice res = invoiceService.create(req);
        return ResponseHandler.generateResponse("Create invoice successfully!", HttpStatus.CREATED, res);
    }
}
