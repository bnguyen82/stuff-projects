package chain.standard;

public class BrandManager extends Approver {
	private static int MAX = 10000;
	@Override
	protected void approve(ApprovalRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount() < MAX){
			System.out.println("BM approved");
		}else{
			System.out.println("BM is not authorized to approve this request");
			if (getSuccessor() != null){
				getSuccessor().approve(request);
			}
		}
	}

}
