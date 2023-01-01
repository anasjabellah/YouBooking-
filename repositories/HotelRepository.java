package com.example.bookingmt.repositories;

import com.example.bookingmt.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel , Long> {
}
