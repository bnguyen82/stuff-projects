package concurrency.lockorder;

public class FileSysUtil {
	public void moveContents(Directory src, Directory dest){
		if (src.hashCode() > dest.hashCode()){
			synchronized(src){
				synchronized(dest){
					System.out.println("Move successfully from " + src + " to " + dest);
				}
			}
		}
		else{
			synchronized(dest){
				synchronized(src){
					System.out.println("Move successfully from " + src + " to " + dest);
				}
			}			
		}
	}
}