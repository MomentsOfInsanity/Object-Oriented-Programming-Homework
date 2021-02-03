package p3;

public class ParkingTicket 
{
	private Cop cop;
	private ParkingMeter parkingMeter;
	private String ticketnumber;
	private double finePerIllegalMinute;
	
	public ParkingTicket(Cop cop, ParkingMeter parkingMeter, String ticketnumber, double finePerIllegalMinute) 
	{
		super();
		this.cop = cop;
		this.parkingMeter = parkingMeter;
		this.ticketnumber = ticketnumber;
		this.finePerIllegalMinute = finePerIllegalMinute;
	}

	public Cop getCop() {
		return cop;
	}

	public void setCop(Cop cop) {
		this.cop = cop;
	}

	public ParkingMeter getParkingMeter() {
		return parkingMeter;
	}

	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = parkingMeter;
	}

	public String getTicketnumber() {
		return ticketnumber;
	}

	public void setTicketnumber(String ticketnumber) {
		this.ticketnumber = ticketnumber;
	}

	public double getFinePerIllegalMinute() {
		return finePerIllegalMinute;
	}

	public void setFinePerIllegalMinute(double finePerIllegalMinute) {
		this.finePerIllegalMinute = finePerIllegalMinute;
	}

	@Override
	public String toString() {
		return "Ticket - " + cop + ", " + parkingMeter + ", ticketnumber=" + ticketnumber
				+ ", finePerIllegalMinute=" + finePerIllegalMinute + "]";
	}
	
	
	
	
	

}
