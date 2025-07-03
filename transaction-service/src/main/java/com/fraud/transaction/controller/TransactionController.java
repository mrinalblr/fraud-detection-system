package com.fraud.transaction.controller;

import com.fraud.transaction.dto.TransactionRequest;
import com.fraud.transaction.service.TransactionPublisherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionPublisherService publisher;

    public TransactionController(TransactionPublisherService publisher) {
        this.publisher = publisher;
    }

    @PostMapping
    public ResponseEntity<String> submitTransaction(@RequestBody TransactionRequest tx) {
        publisher.publish(tx);
        return ResponseEntity.ok("Transaction accepted");
    }
}
