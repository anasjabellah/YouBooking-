package com.example.bookingmt.repositories;

import com.example.bookingmt.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel , Long> {
    // Hotel findByName(String Email);
}
