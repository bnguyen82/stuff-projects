package chain.standard;

public class President extends Approver {
	private static final int MAX = 40000;
	@Override
	protected void approve(ApprovalRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < MAX){
			System.out.println("President approveed ");			
		}else{
			System.out.println("President is not authorized to approve this request");
			if (getSuccessor() != null){
				getSuccessor().approve(request);
			}
		}
	}

}
