package com.backend.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlannerResponse {
    private String id;
    private String message;
    private String source;
    private LocalDateTime timestamp;
    private ResponseStatus status;
    
    public enum ResponseStatus {
        SUCCESS, FAILURE, PENDING
    }
} 