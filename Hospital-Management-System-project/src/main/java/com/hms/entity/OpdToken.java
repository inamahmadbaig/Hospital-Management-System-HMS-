package com.hms.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "opd_tokens")
@Data
@Getter 
@Setter 
@NoArgsConstructor

public class OpdToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String tokenNumber;
    private LocalDateTime issuedAt;
    private String status;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
}