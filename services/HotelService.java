package com.example.bookingmt.services;

import com.example.bookingmt.entities.Hotel;
import com.example.bookingmt.entities.User;

import java.util.List;

public interface HotelService {

    void AddHotel(Hotel hotel ,Long idManager);
    List<Hotel> GetAllHotels();
   // Hotel findByName(String NameHotel);
    void updateHotel(Hotel hotel);
    Boolean DeleteHotel(Long id);

}
