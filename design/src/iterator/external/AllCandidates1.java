package iterator.external;

import iterator.Candidate;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;

import book.util.FileUtil;

public class AllCandidates1 {
//	Enumeration<Candidate> ec;
	Vector<Candidate> data;
//	Candidate nextCandidate;
	public AllCandidates1() {
		initialize();
//		ec = data.elements();
	}
	private void initialize() {
		// TODO Auto-generated method stub
		data = new Vector<Candidate>();
		FileUtil util = new FileUtil();
		Vector list = util.fileToVector("iterator-candidates.txt");
		Enumeration<String> lines = list.elements();
		while (lines.hasMoreElements()){
			String line = lines.nextElement();
			StringTokenizer token = new StringTokenizer(line, ",");
			data.add(new Candidate(token.nextToken(),token.nextToken(), token.nextToken()));
		}
	}
	public Enumeration<Candidate> getAllCandidates(){
		return data.elements();
	}
	public CertificatedCandidates getCertificatedCandidates(String certType){
		return new CertificatedCandidates(this, certType);
	}
}
