package cancelticket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cancelticket.entities.booking_info;
import cancelticket.entities.cancel;
import cancelticket.repositories.CancelRepository;
import cancelticket.repositories.CancelRepositoryT;

@Service
public class CancelServiceT {
	@Autowired
	private CancelRepositoryT repo;
	public cancel newcancel(cancel cn) {
		cancel retcancel = repo.save(cn);
		return retcancel;
	}

	
}
