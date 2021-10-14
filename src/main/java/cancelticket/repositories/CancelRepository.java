package cancelticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cancelticket.entities.booking_info;

@Repository
public interface CancelRepository extends JpaRepository<booking_info, String> {

}
