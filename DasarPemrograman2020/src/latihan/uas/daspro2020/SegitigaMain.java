package latihan.uas.daspro2020;

public class SegitigaMain {

	static void Compare (Segitiga S1, Segitiga S2) {
		Compare(S1, S2);
	}
	
	public static void main (String [] args) {
		Segitiga A = new Segitiga();
		System.out.println("Segitiga A");
		
		System.out.println("Luas : " + A.Luas());
		
		Segitiga B = new Segitiga();
		System.out.println("Segitiga B");
		
		System.out.println("Luas : " + B.Luas());
		Compare (A,B);
	}
}