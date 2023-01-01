package com.example.bookingmt.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int capacity ;
    private int numberRoom ;
    private String option;
    private Double price ;

    @ManyToOne
    private Hotel hotel ;



}
