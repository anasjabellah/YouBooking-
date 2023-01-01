package com.example.bookingmt.services.implementation;

import com.example.bookingmt.entities.Reservation;
import com.example.bookingmt.entities.Room;
import com.example.bookingmt.entities.User;
import com.example.bookingmt.repositories.ReservationRepository;
import com.example.bookingmt.repositories.UserRepository;
import com.example.bookingmt.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private final ReservationRepository reservationRepository;
    private final UserRepository userRepository ;

    public ReservationServiceImpl(ReservationRepository reservationRepository, UserRepository userRepository) {
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void AddReservation(Reservation reservation, User user, Room room) {
        reservation.setClient(user);
        reservation.setRoom(room);
        reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> GetAllRes() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Boolean DeleteReservation(long id) {

        reservationRepository.deleteById(id);

        if(reservationRepository.findById(id) == null){
            return Boolean.TRUE ;
        }else {
            return Boolean.FALSE ;
        }

    }

}
