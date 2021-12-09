package fpt.trainining.movietheatre.service;

import fpt.trainining.movietheatre.dto.invoice.InvoiceReq;
import fpt.trainining.movietheatre.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> findAll();
    Invoice findById(String id);
    Invoice create(InvoiceReq invoiceReq);
}
