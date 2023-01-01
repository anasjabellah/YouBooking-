package com.example.bookingmt.entities;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@ToString
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String userName ;
    private String email ;
    private String  password ;
    private boolean banned;

    @ManyToMany
    private List<Role> roles ;

    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private List<Reservation> reservationList;

//    public boolean isBanned(){
//        return banned;
//    }
}
