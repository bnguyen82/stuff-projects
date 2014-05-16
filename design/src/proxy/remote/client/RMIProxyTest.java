package proxy.remote.client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import proxy.remote.server.CustomerFacadeRemote;

public class RMIProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CustomerFacadeRemote facade = null;
//		facade = (CustomerFacadeRemote)Naming.lookup("rmi://"+"localhost"+":"+"1099"+"/CustomerFacade");
		Registry registry = LocateRegistry.getRegistry("localhost",1099);
		facade = (CustomerFacadeRemote)  registry.lookup("CustomerFacade");
		facade.setFirstName("Thanh");
		facade.setLastName("Hong");
		facade.setStreet("Le Lai");
		facade.setCity("HCMC");
		facade.setState("HCM");
		facade.setCcType("VISA");
		facade.setCcNumber("2222333344445555");
		facade.setCcExpDate("201301");
		boolean success = facade.saveCustomer();
		
	}

}
