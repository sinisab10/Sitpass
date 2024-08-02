package com.sitpass.Sitpass.model;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class WorkDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate validFrom;

    private DayOfWeek day;

    private LocalTime from;

    private LocalTime until;

    @OneToMany(mappedBy = "workDay")
    private List<Facility> facilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getUntil() {
        return until;
    }

    public void setUntil(LocalTime until) {
        this.until = until;
    }
}
