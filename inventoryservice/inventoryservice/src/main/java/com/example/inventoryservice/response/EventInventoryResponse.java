package com.example.inventoryservice.response;

import com.example.inventoryservice.entity.Venue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventInventoryResponse {
    private Long eventId;
    private BigDecimal ticketPrice;
    private String event;
    private Long capacity;
    private Venue venue;
}
