package cancelticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cancelticket.entities.cancel;




 
@Repository
public interface CancelRepositoryT extends JpaRepository<cancel, Integer> {

    
	
}