package com.inti.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHotel;
    private String nom;
    private int nbrEtoile;
    @OneToMany(mappedBy = "hotel")
    private List<Avis> avis;
    @ManyToOne
    @JoinColumn(name = "id_Destination")
    private Destination destination;
    @OneToMany(mappedBy = "hotel")
    private List<Reservation> reservations;

}
