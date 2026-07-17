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
@Table(name = "inventories")
@Getter 
@Setter 
@NoArgsConstructor
public class Inventory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String itemName;
    private Integer quantity;
    private Double unitPrice;
    private LocalDate expiryDate;
    private Integer reorderLevel;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}