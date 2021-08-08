package latihan.uas.daspro2020;

public class SegitigaMain {
	
	static Segitiga A = new Segitiga();
	static Segitiga B = new Segitiga();
	
	static void Compare() {
		if(A.Luas() == B.Luas()) {
			System.out.println(); System.out.println("Kedua segitiga memiliki luas yang sama");
		} else if(A.Luas() != B.Luas()) {
			System.out.println(); System.out.println("Kedua segitiga memiliki luas yang berbeda");
		}
	}

	public static void main(String [] args) {
		
		System.out.println("Segitiga A"); System.out.println();
		
		A.BacaSegitiga(); A.TulisSegitiga();
		System.out.println("Luas : " + A.Luas());
		
		System.out.println();
			
		System.out.println("Segitiga B"); System.out.println();
		
		B.BacaSegitiga(); B.TulisSegitiga();
		System.out.println("Luas : " + B.Luas());

		Compare();
	}

}