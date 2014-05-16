package concurrency.readwritelock;

public class Item {
	private String name;
	private String status;
	private ReadWriteLock rwlock;
	public Item(String name, String status, ReadWriteLock rwlock) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.status = status;
		this.rwlock = rwlock;
	}
	public void checkin(String reader) {
		// TODO Auto-generated method stub
		rwlock.getWriteLock();
		System.out.println(name + " is returned by "+ reader);
		status = "Available";
		rwlock.done();
	}
	public void checkout(String reader) {
		// TODO Auto-generated method stub
		
		rwlock.getWriteLock();
		status = "Not available";
		System.out.println(name + " is borrowed by "+ reader);
		rwlock.done();
	}
	public String getStatus(String reader) {
		// TODO Auto-generated method stub
		rwlock.getReadLock();
		String bookStatus = status;
		System.out.println(name + " is viewed by "+ reader);
		rwlock.done();
		return bookStatus;
	}
}
