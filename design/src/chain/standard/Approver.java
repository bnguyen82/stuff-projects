package chain.standard;

public abstract class Approver {
	private Approver successor;
	
	protected abstract void approve(ApprovalRequest request);
	protected void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	protected Approver getSuccessor() {
		return successor;
	}
	
}
