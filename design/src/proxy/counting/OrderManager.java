package proxy.counting;

import java.util.Vector;

import book.util.FileUtil;

public class OrderManager {
	public Vector getAllOrder(){
		FileUtil fUtil = new FileUtil();
		Vector v = fUtil.fileToVector("counting-proxy-order.txt");
		return v;
	}
}
