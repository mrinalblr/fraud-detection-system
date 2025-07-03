package com.fraud.transaction.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionRequest {
    private String userId;
    private double amount;
    private String location;
    private LocalDateTime timestamp;
}
