package chain.standard;

public class SaleApprovalRequest implements ApprovalRequest {
	private int amount;
	public SaleApprovalRequest(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
}
