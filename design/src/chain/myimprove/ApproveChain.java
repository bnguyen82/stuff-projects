package chain.myimprove;

import java.util.List;

import chain.standard.ApprovalRequest;

public class ApproveChain {
	List<Approver1> approverList;
	int nextApproverIdx;
	public ApproveChain(List<Approver1> list) {
		// TODO Auto-generated constructor stub
		approverList = list;
	}
	public void doApprove(ApprovalRequest request){
		if (nextApproverIdx < approverList.size()){
			approverList.get(nextApproverIdx++).approve(request, this);
		}
	}
}
