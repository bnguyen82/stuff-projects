package iterator.internal;

import iterator.Candidate;

import java.util.Iterator;

public class Iterator1Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllCandidates alls = new AllCandidates();
		for (; alls.hasNext();) {
			Candidate candidate = (Candidate) alls.next();
			System.out.println(candidate);
		}
	}

}
