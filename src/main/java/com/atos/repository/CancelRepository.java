package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.model.booking_info;

@Repository
public interface CancelRepository extends JpaRepository<booking_info, String> {

}
