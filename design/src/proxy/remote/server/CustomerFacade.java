package proxy.remote.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Properties;


import facade.legacy.Account;
import facade.legacy.Address;
import facade.legacy.CreditCard;

public class CustomerFacade extends UnicastRemoteObject implements CustomerFacadeRemote{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3246691020332978373L;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String ccNumber;
	private String ccType;
	private String ccExpDate;
	public CustomerFacade() throws RemoteException{
		System.out.println("Server object created");
	}
	public static void main(String[] args) throws RemoteException{
		String port = "1099";
		String host = "localhost";
//		if (System.getSecurityManager() == null){
			System.setSecurityManager(new SecurityManager());
//		}
		CustomerFacade facade = new CustomerFacade();
		try{
			
//			Properties pop = System.getProperties();
			UnicastRemoteObject.unexportObject(facade, true);
			CustomerFacadeRemote aa = (CustomerFacadeRemote) UnicastRemoteObject.exportObject(facade, 0);
			
			Registry registry = LocateRegistry.getRegistry("localhost",1099);
			registry.bind("CustomerFacade", facade);
			int a = 3;
		
//			Naming.bind("//"+host+":"+port+"/CustomerFacade", facade);
		}catch(Exception e){
			
		System.out.println("Service Bound…");
		}
		
	}
	
	
	public boolean saveCustomer() throws RemoteException{
		boolean isValidData = true;
		Account acc = new Account(firstName, lastName);
		if (!acc.isValid()){
			isValidData = false;
			System.out.print("Account fail");
		}
		CreditCard cc = new CreditCard(ccNumber, ccType, ccExpDate);
		if (!cc.isValid()){
			isValidData = false;
			System.out.print("Account fail");
		}
		Address add = new Address(street, city, state);
		if (add.isValid()){
			isValidData = false;
			System.out.print("Account fail");
		}
		if (isValidData) {
			if (acc.save() && add.save() && cc.save()) return true;
		}
		return false;
	}
	
	//stuff
	public void setFirstName(String firstName) throws RemoteException {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) throws RemoteException {
		this.lastName = lastName;
	}
	public void setStreet(String street) throws RemoteException {
		this.street = street;
	}
	public void setCity(String city) throws RemoteException {
		this.city = city;
	}
	public void setState(String state)  throws RemoteException{
		this.state = state;
	}
	public void setCcNumber(String ccNumber) throws RemoteException {
		this.ccNumber = ccNumber;
	}
	public void setCcType(String ccType)  throws RemoteException{
		this.ccType = ccType;
	}
	public void setCcExpDate(String ccExpDate) throws RemoteException {
		this.ccExpDate = ccExpDate;
	}
}
