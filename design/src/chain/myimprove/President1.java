package chain.myimprove;

import chain.standard.ApprovalRequest;

public class President1 extends Approver1 {
	private static final int MAX = 40000;
	@Override
	protected void approve(ApprovalRequest request, ApproveChain chain) {
		// TODO Auto-generated method stub
		if(request.getAmount() < MAX){
			System.out.println("President approveed ");			
		}else{
			System.out.println("President is not authorized to approve this request");
		}
		chain.doApprove(request);
	}

}
