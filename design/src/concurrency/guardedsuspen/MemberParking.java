package concurrency.guardedsuspen;

public class MemberParking extends Thread{
	private ParkingLot lot;
	private String name;

	public MemberParking(String name, ParkingLot lot) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.lot = lot;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		lot.park();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lot.leave();
	}
}
