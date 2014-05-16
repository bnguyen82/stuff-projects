package facade;

public class FacadeTest {
	public static void main(String[] args) {
		CustomerFacade facade = new CustomerFacade();
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
