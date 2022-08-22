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

    public Long getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(Long idDestination) {
        this.idDestination = idDestination;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Long getLattitude() {
        return lattitude;
    }

    public void setLattitude(Long lattitude) {
        this.lattitude = lattitude;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
