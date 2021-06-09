package pertemuan2.daspro2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LatihanInputBufferedReader {

	public static void main (String [] args) {
		
		/*
		 * Menggunakan BufferedReader
		 * Lebih kuno dari Scanner
		 * Lebih sulit diingat, utility terkesan terbatas
		 * Kapasitas Buffering 8kb
		 * Lebih aman, karena wajib menggunakan try catch blok
		 */
		
		BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
		
		String sNRP, sNama;
		int iNilai;
		double dIPK;
		
		try {
			// Blok try catch untuk menangani error non logik
			sNRP = brInput.readLine();
			sNama = brInput.readLine();
			// Keterbatasan utility mengharuskan konversi tipe data non String
			iNilai = Integer.parseInt(brInput.readLine());
			dIPK = Double.parseDouble(brInput.readLine());
			System.out.println("NRP : " + sNRP + "Nama : " + sNama + "Nilai : " + iNilai + "IPK : " + dIPK);
		} catch(Exception e) {
			System.err.print("Nilai atau IPK harus numerik");
		}
		
	}
}