package com.example.bookingmt.services;

import com.example.bookingmt.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    // add user in data
    void AddUser(User user);

    // list user
    List<User> GetAllUser();

    // get user by email
    User findByEmail(String Email);
    List<User> listBanned();

    // get user by id
    Optional<User> findById(long id);

    // update user
    void updateUser(User user);

    void  AccepterReservation(Long id);


    // delet User
    Boolean DeleteUser(long id);

    void addUserRool(String User , String Rool);

    Boolean isBanned(Long id);

    List<User> findAllByBanned(boolean banned);
}
