package com.example.bookingmt.services.implementation;

import com.example.bookingmt.entities.Room;
import com.example.bookingmt.repositories.RoomRepository;
import com.example.bookingmt.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RoomServiceImpl implements RoomService {

    @Autowired
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {this.roomRepository = roomRepository;}

    @Override
    public void AddRoom(Room room) {
       // if (room.getNumberRoom() == null && room.getCapacity() == null && room.getPrice() == null)
        roomRepository.save(room);
    }

    @Override
    public Optional<Room> findByid(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public List<Room> GetAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public Boolean Delete(Long id) {
        roomRepository.deleteById(id);
        return null;
    }

    @Override
    public void updateRoom(Room room) {}

    @Override
    public void optionRoom(Long id) {}
}
