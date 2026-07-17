package com.hms.enteit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "prescription_medicines")
@Setter
@Getter
@NoArgsConstructor
public class PrescriptionMedicine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String dosage;
    private String frequency;
    private String duration;
    private String instructions;

    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    @ManyToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;
}