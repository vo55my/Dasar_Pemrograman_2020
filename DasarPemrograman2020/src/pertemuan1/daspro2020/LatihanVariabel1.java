package pertemuan1.daspro2020;

public class LatihanVariabel1 {

	/* ada 3 tipe variabel
	 * Variabel Lokal
	 * Variabel Global
	 * Parameter (Materi Subprogram)
	 * 
	 * Pembeda dari 3 Variabel tersebut adalah tata letaknya
	 * 
	 * Variabel Global -> Berada didalam kelas, tetapi berada diluar method
	 * Berikut contohnya
	 */
	static double IPK = 3.14;
	
	public static void main (String [] args) {
		/*
		 * Variabel Lokal -> Variabel yang ada didalam method
		 * Contohnya didalam main program
		 */
		String nama = "Kelar Ken";
		int nilai = 100;
		
		System.out.println("Nama : " + nama);
		System.out.println("Nilai : " + nama);
		System.out.println("IPK : " + IPK);
	}
}