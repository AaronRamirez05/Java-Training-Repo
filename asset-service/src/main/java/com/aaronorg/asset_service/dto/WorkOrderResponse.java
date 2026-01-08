package com.aaronorg.asset_service.dto;

import java.time.Instant;
import java.util.UUID;

public record WorkOrderResponse (
    UUID id,
    String title,
    String description,
    String priority,
    Instant createdAt
){}
