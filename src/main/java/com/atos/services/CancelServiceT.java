package com.atos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.model.booking_info;
import com.atos.model.cancel;
import com.atos.repository.CancelRepository;
import com.atos.repository.CancelRepositoryT;

@Service
public class CancelServiceT {
	@Autowired
	private CancelRepositoryT repo;
	public cancel newcancel(cancel cn) {
		cancel retcancel = repo.save(cn);
		return retcancel;
	}

	
}
