package proxy.remote.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CustomerFacadeRemote extends Remote {
	public boolean saveCustomer() throws RemoteException;
	public void setFirstName(String firstName) throws RemoteException;
	public void setLastName(String lastName) throws RemoteException;
	public void setStreet(String street) throws RemoteException;
	public void setCity(String city) throws RemoteException;
	public void setState(String state) throws RemoteException;
	public void setCcNumber(String ccNumber) throws RemoteException;
	public void setCcType(String ccType) throws RemoteException;
	public void setCcExpDate(String ccExpDate) throws RemoteException;
}
