package com.inti.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateReservation;
    private int nbJours;
    @ManyToOne
    @JoinColumn(name = "id_Voyageur")
    private Voyageur voyageur;
    @ManyToOne
    @JoinColumn(name = "id_Hotel")
    private Hotel hotel;
}
