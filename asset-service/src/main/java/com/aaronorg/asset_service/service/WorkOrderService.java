package com.aaronorg.asset_service.service;

import com.aaronorg.asset_service.model.WorkOrder;

public interface WorkOrderService {

    WorkOrder create(String title, String description, String priority);
    
}
