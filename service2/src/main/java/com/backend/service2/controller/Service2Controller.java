package com.backend.service2.controller;

import com.backend.common.model.PlannerResponse;
import com.backend.common.util.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service2")
public class Service2Controller {

    @GetMapping("/status")
    public PlannerResponse getStatus() {
        return ResponseUtil.createSuccessResponse(
                "Service2 is running",
                "service2"
        );
    }
} 