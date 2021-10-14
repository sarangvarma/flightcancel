package cancelticket.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cancelticket.entities.booking_info;
import cancelticket.repositories.CancelRepository;

@Service
public class CancelService {

	@Autowired
	private CancelRepository repo;
	

	public booking_info getCustomer(String booking_id) {
		booking_info book = repo.getById(booking_id);
//		System.out.println("Edit Dao ::>" + login);
		return book;
	}
	

	public void deletebooking(booking_info book) {
//		System.out.println("Delete DAO ::>" + retLogin);
		repo.delete(book);
	}


}


