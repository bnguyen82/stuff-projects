package iterator.external;

import iterator.Candidate;
import iterator.internal.AllCandidates;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CertificatedCandidates implements Iterator<Candidate> {
	private AllCandidates1 alls;
	private Enumeration<Candidate> ec;
	private String certType;
	private Candidate nextCandidate;
	public CertificatedCandidates(AllCandidates1 alls, String certType) {
		// TODO Auto-generated constructor stub
		this.alls = alls;
		this.certType = certType;
		this.ec = this.alls.getAllCandidates();
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		nextCandidate  = null;
		while (ec.hasMoreElements()){
			Candidate can = ec.nextElement();
			if (certType.equals(can.getCertificate())){
				nextCandidate = can;
				break;
			}
		}
		return (nextCandidate != null);
	}
	@Override
	public Candidate next() {
		// TODO Auto-generated method stub
		if (nextCandidate == null) throw new NoSuchElementException();
		return nextCandidate;
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
