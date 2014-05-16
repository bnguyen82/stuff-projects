package concurrency.readwritelock;

public class ReadWriteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadWriteLock rwlock = new ReadWriteLock();
		Item item = new Item("Spring in Action", "Available", rwlock);
		MemberTransaction reader1 = new MemberTransaction("Teo", item, "Checkout");
		MemberTransaction reader2 = new MemberTransaction("Ti", item, "Checkout");
		MemberTransaction reader3 = new MemberTransaction("Minh", item, "ViewInfo");
		MemberTransaction reader4 = new MemberTransaction("Vu", item, "Checkout");
	}

}
