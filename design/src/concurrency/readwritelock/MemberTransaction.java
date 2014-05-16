package concurrency.readwritelock;

public class MemberTransaction extends Thread{
	private String name;
	private Item book;
	private String operation;
	public MemberTransaction(String name, Item book, String operation) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.book = book;
		this.operation = operation;
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if ("Checkout".equals(operation)){
			book.checkout(name);
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
			book.checkin(name);
		}else if ("ViewInfo".equals(operation)){
			book.getStatus(name);
		}
			
	}
}
