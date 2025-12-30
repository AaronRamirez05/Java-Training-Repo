package com.aaronorg.asset_service.controller;

import com.aaronorg.asset_service.dto.PingResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Asset service is running!";
    }

    @GetMapping("/healthz")
    public String healthz() {
        return "ok";
    }
    
    
    
}
