package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

}
