package com.example.bookingmt.services;

import com.example.bookingmt.entities.Room;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    Room AddRoom(Room room , Long id);
    Optional<Room> findByid(Long id);
    List<Room> GetAllRoom();
    Boolean Delete(Long id);
    void updateRoom(Room room , Long id);
    void optionRoom(Long id);

    List<Room> findByHotelId(Long id);

}
