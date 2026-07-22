package com.hms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.OpdToken;

public interface OpdTokenRepository extends JpaRepository<OpdToken, Long> {

	Optional<OpdToken> findByTokenNumber(String tokenNumber);
	
}
