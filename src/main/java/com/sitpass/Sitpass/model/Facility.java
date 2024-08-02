package com.sitpass.Sitpass.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;

    private  String description;

    private LocalDate createdAt;

    private  String address;

    private String city;

    private double totalRating;

    private boolean active;

    @OneToMany(mappedBy = "facility")
    private List<Discipline> disciplines ;

    @ManyToOne
    @JoinColumn(name = "workDay_id")
    private WorkDay workDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
