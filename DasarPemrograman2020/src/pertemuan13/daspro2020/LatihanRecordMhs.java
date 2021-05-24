package pertemuan13.daspro2020;

public class LatihanRecordMhs {

	static class Mahasiswa {
		/*
		 * field adalah representasi dari atribut
		 * pembuatannya mirip dengan membuat variabel
		 */
		private String sNRP;
		private String sNama;
		private double dIPK;
		
		void inputData(String nrp, String nama, double ipk) {
			sNRP = nrp;
			sNama = nama;
			dIPK = ipk;
		}
		
		String tampilData() {
			return sNRP + " dengan nama " + sNama + " memiliki IPK " + dIPK;
		}
	}
	
	public static void main (String [] args) {
		/*
		 * cara memanggil record
		 * caranya mirip dengan saat kita menggunakan Scanner
		 * Scanner sc = new Scanner (System.in);
		 * [kelas/record] [alias] = new [kelas/record]();
		 */
		Mahasiswa mhs = new Mahasiswa();
		/*
		 * cara mengakses Field?
		 * sama seperti saat menggunakan fungsi dalam Scanner
		 * sc.next(); sc.nextInt();
		 * [alias/record].[field/method];
		 */
//		mhs.sNRP = "203040119";
//		mhs.sNama = "Dhaifullah Hilmy";
//		mhs.dIPK = 4.75;
//		System.out.println(mhs.sNRP + " dengan nama " + mhs.sNama + " memiliki IPK " + mhs.dIPK);
		
		mhs.inputData("203040119", "Dhaifullah Hilmy", 4.75);
		System.out.println(mhs.tampilData());
		
		Mahasiswa mhs2 = new Mahasiswa();
		mhs2.inputData("203040911", "Hilmy Dhaifullah", 2.12);
		System.out.println(mhs2.tampilData());
	}
}