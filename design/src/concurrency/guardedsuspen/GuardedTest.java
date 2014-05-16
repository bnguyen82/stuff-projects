package concurrency.guardedsuspen;

public class GuardedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot lot = new ParkingLot();
		MemberParking mem1 = new MemberParking("Hyndai", lot);
		MemberParking mem2 = new MemberParking("Honda", lot);
		MemberParking mem3 = new MemberParking("Civic", lot);
		MemberParking mem4 = new MemberParking("BMV", lot);
		MemberParking mem5 = new MemberParking("BMV", lot);
		MemberParking mem6 = new MemberParking("BMV", lot);
		MemberParking mem7 = new MemberParking("BMV", lot);
		
		mem1.start();
		mem2.start();
		mem3.start();
		mem4.start();
		mem5.start();
		mem6.start();
		mem7.start();
		
	}

}
