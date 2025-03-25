package com.example.inventoryservice.controller;

import com.example.inventoryservice.response.EventInventoryResponse;
import com.example.inventoryservice.response.VenueInventoryResponse;
import com.example.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor

public class InventoryController {

    @Autowired
    private InventoryService inventoryService;


    @GetMapping("/inventory/events")
    public ResponseEntity<List<EventInventoryResponse>> inventoryGetAllEvents() {
        return ResponseEntity.ok(inventoryService.getAllEvents());
    }

    @GetMapping("/inventory/venue/{venueId}")
    public ResponseEntity<VenueInventoryResponse> inventoryByVenueId(@PathVariable("venueId") Long venueId) {
        return ResponseEntity.ok(inventoryService.getVenueInformation(venueId));

    }

    @GetMapping("/inventory/event/{eventId}")
    public ResponseEntity<EventInventoryResponse> inventoryForEvent(@PathVariable("eventId") Long eventId) {
        return ResponseEntity.ok(inventoryService.getEventInventory(eventId));

    }

    @PutMapping("/inventory/event/{eventId}/capacity/{capacity}")
    public ResponseEntity<Void> updateEventCapacity(@PathVariable("eventId") Long eventId,
                                                    @PathVariable("capacity") Long ticketsBooked) {
        inventoryService.updateEventCapacity(eventId, ticketsBooked);
        return ResponseEntity.ok().build();
    }

}
