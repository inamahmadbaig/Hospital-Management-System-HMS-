package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
//--- Appointment & Prescription Repositories ---