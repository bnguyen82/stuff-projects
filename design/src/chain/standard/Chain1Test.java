package chain.standard;

public class Chain1Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApprovalRequest request = new SaleApprovalRequest(23000);
		Approver bm = new BrandManager();
		Approver director = new Director();
		Approver president = new President();
		
		bm.setSuccessor(director);
		director.setSuccessor(president);
		
		bm.approve(request);
	}

}
