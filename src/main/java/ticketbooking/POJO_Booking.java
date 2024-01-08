package ticketbooking;

import jakarta.persistence.Id;

//@Entity
public class POJO_Booking {
//	@Id
	private int id;
	private String name;
	private String showTime;
	private int seats;

	public POJO_Booking() {
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setShowTime(String showTime) {
		this.showTime=showTime;
	}
	public String getShowTime() {
		return showTime;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}
