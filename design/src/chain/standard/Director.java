package chain.standard;

public class Director extends Approver {
	private final int MAX = 20000;
	@Override
	protected void approve(ApprovalRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount()<MAX){
			System.out.println("Director approved");
		}else {
			System.out.println("Director is not authorized to approve this request");
			if (getSuccessor() != null){
				getSuccessor().approve(request);
			}
		}
		
	}

}
