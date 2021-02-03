package p3;

public class Demo 
{

	public static void main(String[] args) 
	{
		Cop cop = new Cop("John Doe", "123");
	
		
		ParkingMeter pm = new ParkingMeter(50, "SuffolkMeter101");
		ParkingMeter pm2 = new ParkingMeter(100, "SuffolkMeter102");
		ParkingTicket pt1 = new ParkingTicket(cop, pm, "101", 0.1);
		
		Cop cop2 = new Cop("Jane Doe", "321");
		ParkingTicket pt2 = new ParkingTicket(cop2, pm2, "210", 0.15);
		//pt1.setCop(cop2);
		
		System.out.println(pt1.toString());
		System.out.println(pt2.toString());	

	}

}
