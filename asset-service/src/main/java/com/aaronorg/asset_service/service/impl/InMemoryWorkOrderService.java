package com.aaronorg.asset_service.service.impl;

import com.aaronorg.asset_service.model.WorkOrder;
import com.aaronorg.asset_service.service.WorkOrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryWorkOrderService implements WorkOrderService{
    private final List<WorkOrder> store = new ArrayList<>();

    @Override 
    public WorkOrder create(String title, String description, String priority){
        //Business rule example
        if (priority.equalsIgnoreCase("LOW")){
            throw new IllegalArgumentException("LOW priority work orders are not allowed");
        }

        WorkOrder workOrder = new WorkOrder(title, description, priority);
        store.add(workOrder);
        return workOrder;
    }
}
