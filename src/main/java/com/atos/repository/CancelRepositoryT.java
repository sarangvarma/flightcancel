package com.atos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.atos.model.cancel;




 
@Repository
public interface CancelRepositoryT extends JpaRepository<cancel, Integer> {

    
	
}