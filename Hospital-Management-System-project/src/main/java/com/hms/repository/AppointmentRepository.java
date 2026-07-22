package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	List<Appointment> findByPatientId(Long patientId);
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByStatus(String status);
}
