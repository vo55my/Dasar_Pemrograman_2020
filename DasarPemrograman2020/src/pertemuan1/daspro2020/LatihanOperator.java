package pertemuan1.daspro2020;

public class LatihanOperator {

	/*
	 * Kali ini kita akan mempelajari terkait operator matematis
	 * + (Tambah)
	 * - (Kurang)
	 * * (Kali)
	 * / (Bagi)
	 * % (Modulus/Sisa Bagi)
	 */
	
	public static void main (String [] args) {
		int a = 5;
		int b = 6;
		
		// Menggunakan operator tambah
		// Fungsi tambah akan berbeda mengikuti variabelnya
		
		System.out.println(a + b);
		System.out.println("Hasil jumlah = " + a + b);
		// Operator + saat bertemu String akan menjadi penggabung
		System.out.println("Hasil jumlah = " + (a + b));
		
		// Menggunakan operator kurang
		System.out.println("Hasil kurang = " + (a - b));
		// Menggunakan operator kali
		System.out.println("Hasil kali = " + (a * b));
		// Menggunakan operator bagi
		System.out.println("Hasil bagi = " + (a / b));
		// Menggunakan operator modulus/sisa bagi -> Mencari kelipatan, Ganjil/Genap
		System.out.println("Hasil modulus = " + (a % b));
		
		// Fungsi increment dan decrement
		// increment penjumlahan (tambah1) -> ++
		// decrement pengurangan (kurang1) -> --
		// Postfix (setelah angka) dan Prefix (sebelum angka)
		
		System.out.println("Nilai a = " + a);
		
		System.out.println("");
		System.out.println("Increment");
		System.out.println(a++);
		System.out.println("Nilai a = " + a);
		// Prefix penjumlahan  +1 tidak langsung dilakukan
		System.out.println(++a);
		System.out.println("Nilai a = " + a);
		// Postfix langsung dilakukan
		System.out.println("");
		
		System.out.println("Decrement");
		System.out.println(a--);
		System.out.println("Nilai a = " + a);
		// Prefix penjumlahan  +1 tidak langsung dilakukan
		System.out.println(--a);
		System.out.println("Nilai a = " + a);
		// Postfix langsung dilakukan
		
	}
}