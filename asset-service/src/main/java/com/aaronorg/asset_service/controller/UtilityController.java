package com.aaronorg.asset_service.controller;

import com.aaronorg.asset_service.dto.PingResponse;
import com.aaronorg.asset_service.dto.WorkOrderResponse;
import com.aaronorg.asset_service.dto.CreateWorkOrderRequest;
import com.aaronorg.asset_service.dto.EchoRequest;
import jakarta.validation.Valid;
import com.aaronorg.asset_service.service.WorkOrderService;

import org.hibernate.boot.registry.classloading.spi.ClassLoaderService.Work;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/v1")
public class UtilityController {
    private final WorkOrderService workOrderService;

    public UtilityController(WorkOrderService workOrderService){
        this.workOrderService = workOrderService;
    }

    @PostMapping("/work-orders")
    public WorkOrderResponse createWorkOrder(
        @Valid @RequestBody CreateWorkOrderRequest request
    ) {
        var workOrder = workOrderService.create(request.title(),
        request.Description(), 
        request.priority());
        
        return new WorkOrderResponse(workOrder.getId(),
        workOrder.getTitle(), 
        workOrder.getDescription(), 
        workOrder.getPriority(), 
        workOrder.getCreatedAt());
    }
    
    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("ok","asset-service");
    }

    @PostMapping("/echo")
    public EchoRequest echo(@Valid @RequestBody EchoRequest request) {
        return request;
    }
    
    
    

}
