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
    //private String prenom;
    private int age;
    @OneToMany(mappedBy = "voyageur")
    private List<Reservation> reservations;
 
    public Voyageur() {
	}
    
	public Long getIdVoyageur() {
        return idVoyageur;
    }

    public void setIdVoyageur(Long idVoyageur) {
        this.idVoyageur = idVoyageur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", reservations=" + reservations + "]";
	}
    
}
