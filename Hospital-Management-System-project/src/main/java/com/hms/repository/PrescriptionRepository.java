package com.hms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

	Optional<Prescription> findByAppointmentId(Long appointmentId);
}
