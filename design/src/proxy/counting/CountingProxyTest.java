package proxy.counting;

import java.util.Vector;

public class CountingProxyTest {
	public static void main(String[] args) {
		ProxyOrderManager order = new ProxyOrderManager();
		Vector v1 = order.getAllOrder();
		Vector v2 = order.getAllOrder();
		Vector v3 = order.getAllOrder();
	}
}
