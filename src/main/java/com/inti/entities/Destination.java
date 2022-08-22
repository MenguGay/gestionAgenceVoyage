package com.inti.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Destination implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDestination;
    private Long longitude;
    private Long lattitude;
    @OneToMany(mappedBy = "destination")
    private List<Hotel> hotels;
}
