package cancelticket.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class cancel {
		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ca_id")
	    @SequenceGenerator(name = "ca_id", sequenceName = "ca_sequence", allocationSize = 1)
		private int ca_id;
		private String booking_id;
		private String reason;
		
		public int getCa_id() {
			return ca_id;
		}
		public void setCa_id(int ca_id) {
			this.ca_id = ca_id;
		}
		public String getBooking_id() {
			return booking_id;
		}
		public void setBooking_id(String booking_id) {
			this.booking_id = booking_id;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
	

}
