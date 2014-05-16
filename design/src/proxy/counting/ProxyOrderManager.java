package proxy.counting;

import java.util.Collections;
import java.util.Vector;

import book.util.FileUtil;

public class ProxyOrderManager {
	private OrderManager order;
	ProxyOrderManager(){
		order = new OrderManager();
	}
	public Vector getAllOrder(){
		long t1 = System.currentTimeMillis();
		Vector v = order.getAllOrder();
		long t2 = System.currentTimeMillis();
		FileUtil fUtil = new FileUtil();
		String line = v.size()+"in "+(t2-t1)+" s";
		fUtil.writeToFile("counting-proxy-log.txt", line , true, true);
		return v;
	}
}
