package chain.myimprove;

import java.util.ArrayList;
import java.util.List;

import chain.standard.ApprovalRequest;
import chain.standard.Approver;
import chain.standard.BrandManager;
import chain.standard.Director;
import chain.standard.President;
import chain.standard.SaleApprovalRequest;

public class Chain2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApprovalRequest request = new SaleApprovalRequest(15000);
		Approver1 bm = new BrandManager1();
		Approver1 director = new Director1();
		Approver1 president = new President1();
		List<Approver1> approverList = new ArrayList<Approver1>();
		approverList.add(bm);
		approverList.add(director);
		approverList.add(president);
		
		// TODO Auto-generated method stub
		ApproveChain chain = new ApproveChain(approverList );
		chain.doApprove(request);
	}

}
