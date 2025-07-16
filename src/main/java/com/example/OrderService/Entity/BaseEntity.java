package com.example.OrderService.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    protected Instant updatedAt;

    /**
     * Method to be called when the entity is created.
     * It sets the createdAt and updatedAt fields to the current time.
     */

    @PrePersist
    protected void onCreate() {
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }


    /**
     * Method to be called when the entity is updated.
     * It sets the updatedAt field to the current time.
     */

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = Instant.now();
    }

}
