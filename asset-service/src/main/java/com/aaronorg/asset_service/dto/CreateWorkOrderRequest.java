package com.aaronorg.asset_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateWorkOrderRequest (
    @NotBlank(message = "title is required")
    String title,
    
    String Description,

    @NotNull(message = "priority is required")
    String priority
) {}
