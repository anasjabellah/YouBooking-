package com.example.bookingmt.services;

import com.example.bookingmt.entities.Hotel;
import com.example.bookingmt.entities.User;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    void AddHotel(Hotel hotel ,Long idManager);
    List<Hotel> GetAllHotels();

    Optional<Hotel> findById(long id);
   // Hotel findByName(String NameHotel);
    void updateHotel(Hotel hotel , Long id);
    Boolean DeleteHotel(Long id);

}
