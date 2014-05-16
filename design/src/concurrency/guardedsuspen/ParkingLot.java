package concurrency.guardedsuspen;

public class ParkingLot {
	
	private static final int MAX_CAPACITY = 2;
	private int totalparking;
	public synchronized void park(){
		while (totalparking >= MAX_CAPACITY){
			try {
				System.out.println(Thread.currentThread().getId() + " now waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getId() + " now waked up");
		}
		totalparking++;
		System.out.println(Thread.currentThread().getId() + " parked");
	}
	public synchronized void leave(){
		notifyAll();
		totalparking--;
	}

}
