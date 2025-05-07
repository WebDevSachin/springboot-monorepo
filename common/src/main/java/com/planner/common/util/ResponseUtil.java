package com.backend.common.util;

import com.backend.common.model.PlannerResponse;
import java.time.LocalDateTime;
import java.util.UUID;

public class ResponseUtil {
    
    public static PlannerResponse createSuccessResponse(String message, String source) {
        return PlannerResponse.builder()
                .id(UUID.randomUUID().toString())
                .message(message)
                .source(source)
                .timestamp(LocalDateTime.now())
                .status(PlannerResponse.ResponseStatus.SUCCESS)
                .build();
    }
    
    public static PlannerResponse createErrorResponse(String message, String source) {
        return PlannerResponse.builder()
                .id(UUID.randomUUID().toString())
                .message(message)
                .source(source)
                .timestamp(LocalDateTime.now())
                .status(PlannerResponse.ResponseStatus.FAILURE)
                .build();
    }
} 