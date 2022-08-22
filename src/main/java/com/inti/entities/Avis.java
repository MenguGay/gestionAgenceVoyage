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
    
    
    
    public Avis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(Long idAvis) {
        this.idAvis = idAvis;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaire=" + commentaire + ", hotel=" + hotel + "]";
	}
    
    
}
