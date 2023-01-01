package com.example.bookingmt.ressources;

import com.example.bookingmt.entities.Reservation;
import com.example.bookingmt.entities.User;
import com.example.bookingmt.services.ReservationService;
import com.example.bookingmt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/Reservation")
public class ReservationResource {

    @Autowired
    ReservationService reservationService;

    @GetMapping(path = "/")
    public ResponseEntity<List<Reservation>> GatAllRes(){
        List<Reservation> reservations = reservationService.GetAllRes();
        return ResponseEntity.ok(reservations);

    }

}
