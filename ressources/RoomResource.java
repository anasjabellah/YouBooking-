package com.example.bookingmt.ressources;

import com.example.bookingmt.entities.Hotel;
import com.example.bookingmt.entities.Room;
import com.example.bookingmt.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(path = "/Rooms")
public class RoomResource {

    @Autowired
    RoomService roomService;


    @PostMapping("/add/{idHotel}")
    public Room save(@RequestBody Room room , @PathVariable Long idHotel) {
        return roomService.AddRoom(room,idHotel);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Room> GetResById(@PathVariable("id") long id){
        Optional<Room> RoomID = roomService.findByid(id);
        if(RoomID.isPresent()){
            return new ResponseEntity<>(RoomID.get() , HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
