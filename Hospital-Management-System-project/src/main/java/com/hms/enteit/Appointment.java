package com.hms.enteit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "appointments")
@Getter 
@Setter 
@NoArgsConstructor
public class Appointment {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private String status;
    private String reason;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToOne(mappedBy = "appointment", cascade = CascadeType.ALL)
    private OpdToken opdToken;

    @OneToOne(mappedBy = "appointment", cascade = CascadeType.ALL)
    private Prescription prescription;
}