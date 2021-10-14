package cancelticket.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class booking_info {
	@Id
	private String booking_id;
	private Date booking_dt;
	private String f_no;
	private int cid;
	private int price;
	private int seat_book;
	private Date doj;
	public String getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}
	public Date getBooking_dt() {
		return booking_dt;
	}
	public void setBooking_dt(Date booking_dt) {
		this.booking_dt = booking_dt;
	}
	public String getF_no() {
		return f_no;
	}
	public void setF_no(String f_no) {
		this.f_no = f_no;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSeat_book() {
		return seat_book;
	}
	public void setSeat_book(int seat_book) {
		this.seat_book = seat_book;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

}
