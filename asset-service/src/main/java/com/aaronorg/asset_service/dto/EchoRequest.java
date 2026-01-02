package com.aaronorg.asset_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record EchoRequest(
    @NotBlank(message = "message is required")
    @Size(max = 200, message = "message must be <= 200 characters")
    String message
) {}
