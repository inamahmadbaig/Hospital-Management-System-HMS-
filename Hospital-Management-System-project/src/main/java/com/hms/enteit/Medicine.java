package com.hms.enteit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "medicines")
@Getter 
@Setter 
@NoArgsConstructor
public class Medicine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String medicineName;
    private String manufacturer;
    private Double unitPrice;
    private Integer stock;

    @OneToMany(mappedBy = "medicine")
    private List<PrescriptionMedicine> prescriptions;
}