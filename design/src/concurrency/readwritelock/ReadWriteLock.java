package concurrency.readwritelock;

public class ReadWriteLock {
	private Object lock = new Object();
	private int numReadLockIssued;
	private int numWriteLockWaiting;
	private boolean isWriteLockIssued;
	
	public void getWriteLock() {
		// TODO Auto-generated method stub
		synchronized(lock){
			while (isWriteLockIssued || numReadLockIssued > 0){
				try {
					numWriteLockWaiting++;
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isWriteLockIssued = true;
			numWriteLockWaiting--;
		}
	}
	public void getReadLock(){
		synchronized (lock){
			while (numWriteLockWaiting > 0 || isWriteLockIssued){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			numReadLockIssued++;
		}
	}
	public void done(){
		synchronized(lock){
			lock.notifyAll();
			if (numReadLockIssued == 0 && !isWriteLockIssued){
				System.out.println("Invalid operation: No lock's been issued before");
				return;
			}
			if (isWriteLockIssued){
				isWriteLockIssued = false;
			}else{
				numReadLockIssued--;
			}
			
		}
	}
}
