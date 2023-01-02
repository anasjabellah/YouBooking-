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
        return true;
    }

    @Override
    public void updateRoom(Room room ,  Long id) {
        Room room1 = roomRepository.findById(id).orElse(null);
        room1.setNumberRoom(room.getNumberRoom());
        room1.setCapacity(room.getCapacity());
        room1.setOption(room.getOption());
        room1.setPrice(room.getPrice());
        roomRepository.save(room1);

    }

    @Override
    public void optionRoom(Long id) {}
}
