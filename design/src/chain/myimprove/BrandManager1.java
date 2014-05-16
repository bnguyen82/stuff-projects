package chain.myimprove;

import chain.standard.ApprovalRequest;

public class BrandManager1 extends Approver1 {
	private static int MAX = 10000;
	@Override
	protected void approve(ApprovalRequest request, ApproveChain chain) {
		// TODO Auto-generated method stub
		if (request.getAmount() < MAX){
			System.out.println("BM approved");
		}else{
			System.out.println("BM is not authorized to approve this request");
		}
		chain.doApprove(request);
	}

}
