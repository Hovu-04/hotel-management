package com.hotel.hotel_stars.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "booking_room_service_hotel", schema = "hotel_manager")
public class BookingRoomServiceHotel {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "create_at")
    private Instant createAt;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_room_id")
    private BookingRoom bookingRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_hotel_id")
    private ServiceHotel serviceHotel;

}