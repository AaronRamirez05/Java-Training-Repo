package com.aaronorg.asset_service.dto;

import java.time.Instant;
import java.util.List;

public record ErrorResponse (
    Instant timestamp,
    int status,
    String Error,
    List<String> messages
){}
