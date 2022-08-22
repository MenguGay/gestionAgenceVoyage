package com.inti.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Voyageur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVoyageur;
    private String nom;
    private String prenom;
    private int age;
    @OneToMany(mappedBy = "voyageur")
    private List<Reservation> reservations;
}
