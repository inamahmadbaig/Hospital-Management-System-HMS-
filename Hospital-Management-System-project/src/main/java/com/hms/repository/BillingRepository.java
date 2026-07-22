package com.hms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

	Optional<Billing> findByBillNumber(String billNumber);
    List<Billing> findByPatientId(Long patientId);
}
