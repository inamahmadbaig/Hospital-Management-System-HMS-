package com.hms.enteit;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "billings")
@Getter 
@Setter 
@NoArgsConstructor
public class Billing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String billNumber;
    private Double amount;
    private Double tax;
    private Double totalAmount;
    private String paymentStatus;
    private String paymentMethod;
    private String transactionId;
    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne(mappedBy = "billing", cascade = CascadeType.ALL)
    private Payment payment;
}