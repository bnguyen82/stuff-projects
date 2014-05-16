package iterator.internal;

import iterator.Candidate;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;

import book.util.FileUtil;

public class AllCandidates implements Iterator {
	Enumeration<Candidate> ec;
	Vector<Candidate> data  = new Vector<Candidate>();
	Candidate nextCandidate;
	public AllCandidates() {
		initialize();
		ec = data.elements();
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
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		nextCandidate = null;
		while (ec.hasMoreElements()){
			nextCandidate = ec.nextElement();
			break;
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
