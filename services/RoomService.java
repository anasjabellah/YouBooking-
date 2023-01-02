package com.example.bookingmt.services;

import com.example.bookingmt.entities.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    void AddRoom(Room room);
    Optional<Room> findByid(Long id);
    List<Room> GetAllRoom();
    Boolean Delete(Long id);
    void updateRoom(Room room , Long id);
    void optionRoom(Long id);
}
