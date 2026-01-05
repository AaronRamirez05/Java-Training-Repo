package com.aaronorg.asset_service.model;

import java.time.Instant;
import java.util.UUID;

public class WorkOrder {
    private final UUID id;
    private final String title;
    private final String description;
    private final String priority;
    private final Instant createdAt;

    public WorkOrder(String title, String description, String priority){
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.createdAt = Instant.now();
    }

    public UUID getId(){    return id;  }
    public String getTitle(){  return title;   }
    public String getDescription(){     return description; }
    public String getPriority(){    return priority;    }
    public Instant getCreatedAt(){  return createdAt;   }
}
