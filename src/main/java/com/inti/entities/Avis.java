package com.inti.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Avis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvis;
    private String commentaire;
    @ManyToOne
    @JoinColumn(name = "id_Hotel")
    private Hotel hotel;
}
