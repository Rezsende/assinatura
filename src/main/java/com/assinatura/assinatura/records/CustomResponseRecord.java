package com.assinatura.assinatura.records;

import java.time.LocalDateTime;

public record CustomResponseRecord(int status, String message, LocalDateTime timestamp) {
    public CustomResponseRecord(int status, String message) {
        this(status, message, LocalDateTime.now());
    }

}
