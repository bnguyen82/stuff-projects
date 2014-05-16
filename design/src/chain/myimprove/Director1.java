package chain.myimprove;

import chain.standard.ApprovalRequest;

public class Director1 extends Approver1 {
	private final int MAX = 20000;
	@Override
	protected void approve(ApprovalRequest request, ApproveChain chain) {
		// TODO Auto-generated method stub
		if (request.getAmount()<MAX){
			System.out.println("Director approved");
		}else {
			System.out.println("Director is not authorized to approve this request");
		}
		chain.doApprove(request);
	}
}
