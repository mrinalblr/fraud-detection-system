package com.fraud.transaction.service;


import com.fraud.transaction.dto.TransactionRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TransactionPublisherService {

    private final KafkaTemplate<String, TransactionRequest> kafkaTemplate;

    public TransactionPublisherService(KafkaTemplate<String, TransactionRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(TransactionRequest tx) {
        kafkaTemplate.send("transactions", tx.getUserId(), tx);
    }
}
