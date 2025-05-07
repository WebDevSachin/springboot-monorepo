package com.backend.service1.controller;

import com.backend.common.model.PlannerResponse;
import com.backend.common.util.ResponseUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service1")
public class Service1Controller {

    @GetMapping("/status")
    public PlannerResponse getStatus() {
        return ResponseUtil.createSuccessResponse(
                "Service1 is running",
                "service1"
        );
    }
} 