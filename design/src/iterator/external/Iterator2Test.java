package iterator.external;

public class Iterator2Test {
	public static void main(String[] args) {
		AllCandidates1 alls = new AllCandidates1();
		CertificatedCandidates allsCert = new CertificatedCandidates(alls , "IBM");
		for (;allsCert.hasNext();){
			System.out.print(allsCert.next());
		}
	}
}
