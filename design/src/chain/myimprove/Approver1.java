package chain.myimprove;

import chain.standard.ApprovalRequest;

public abstract class Approver1 {
	private Approver1 successor;
	
	protected abstract void approve(ApprovalRequest request, ApproveChain chain);
	protected void setSuccessor(Approver1 successor) {
		this.successor = successor;
	}
	protected Approver1 getSuccessor() {
		return successor;
	}
	
}
