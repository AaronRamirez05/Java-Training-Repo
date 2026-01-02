package com.aaronorg.asset_service.controller;

import com.aaronorg.asset_service.dto.PingResponse;
import com.aaronorg.asset_service.dto.CreateWorkOrderRequest;
import com.aaronorg.asset_service.dto.EchoRequest;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1")
public class UtilityController {

    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("ok","asset-service");
    }

    @PostMapping("/echo")
    public EchoRequest echo(@Valid @RequestBody EchoRequest request) {
        return request;
    }

    @PostMapping("/work-orders")
    public CreateWorkOrderRequest createWorkOrder(@Valid @RequestBody CreateWorkOrderRequest request) {
        return request;
    }
    
    
    

}
