package com.example.bookingmt.ressources;


import com.example.bookingmt.entities.Hotel;
import com.example.bookingmt.entities.User;
import com.example.bookingmt.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Hotels")
public class HotelResource {

    @Autowired
    HotelService hotelService ;

    @GetMapping(path = "/AllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotels = hotelService.GetAllHotels() ;
        return ResponseEntity.ok(hotels);
    }

}
