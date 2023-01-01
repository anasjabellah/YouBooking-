package com.example.bookingmt.repositories;

import com.example.bookingmt.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room , Long> {
}
