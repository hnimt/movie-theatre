package fpt.trainining.movietheatre.controller;

import fpt.trainining.movietheatre.dto.ResponseHandler;
import fpt.trainining.movietheatre.dto.invoice.InvoiceConfirmReq;
import fpt.trainining.movietheatre.entity.Invoice;
import fpt.trainining.movietheatre.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/invoice")
@AllArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity getAll(Principal principal) {
        String username = principal.getName();
        List<Invoice> res = invoiceService.findByAccountName(username);
        return ResponseHandler.generateResponse("Get invoices successfully!", HttpStatus.OK, res);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody InvoiceConfirmReq req) {
        Invoice res = invoiceService.confirmInvoice(req);
        return ResponseHandler.generateResponse("Create invoice successfully!", HttpStatus.CREATED, res);
    }
}
