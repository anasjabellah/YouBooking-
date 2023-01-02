package com.example.bookingmt.services.implementation;

import com.example.bookingmt.entities.Hotel;
import com.example.bookingmt.entities.User;
import com.example.bookingmt.repositories.HotelRepository;
import com.example.bookingmt.repositories.UserRepository;
import com.example.bookingmt.services.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {


    private final UserRepository userRepository;
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(UserRepository userRepository, HotelRepository hotelRepository) {
        this.userRepository = userRepository;
        this.hotelRepository = hotelRepository;
    }


    @Override
    public void AddHotel(Hotel hotel, Long idManager) {
        User user = userRepository.findById(idManager).orElse(null);
        if(hotel.getAddress() != null && hotel.getCity() != null && hotel.getName() != null){
            if(user.getRoles().equals("manadger") && user.getRoles().equals("admin")){
                hotel.setManager(user);
                hotelRepository.save(hotel);
            }
        }
    }

    @Override
    public List<Hotel> GetAllHotels() {
        return hotelRepository.findAll();
    }


    public Hotel findByName(String NameHotel) {
        return null ; // hotelRepository.findByName(NameHotel);
    }

    @Override
    public void updateHotel(Hotel hotel) {

    }

    @Override
    public Boolean DeleteHotel(Long id) {
        return Boolean.TRUE;
    }
}
