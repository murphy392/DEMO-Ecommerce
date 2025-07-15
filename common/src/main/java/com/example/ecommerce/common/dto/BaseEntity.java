package com.example.ecommerce.common.dto;

import java.time.LocalDateTime;

public abstract class BaseEntity {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    public String getId() { 
        return id; 
    }
    
    public void setId(String id) { 
        this.id = id; 
    }
    
    public LocalDateTime getCreatedAt() { 
        return createdAt; 
    }
    
    public void setCreatedAt(LocalDateTime createdAt) { 
        this.createdAt = createdAt; 
    }
    
    public LocalDateTime getUpdatedAt() { 
        return updatedAt; 
    }
    
    public void setUpdatedAt(LocalDateTime updatedAt) { 
        this.updatedAt = updatedAt; 
    }
    
    /**
     * Call this method before saving/updating the entity
     */
    public void updateTimestamp() {
        this.updatedAt = LocalDateTime.now();
        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }
}
