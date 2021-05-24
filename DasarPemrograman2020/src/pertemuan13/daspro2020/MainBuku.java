package pertemuan13.daspro2020;

import java.util.Scanner;

public class MainBuku {

	/*
	 * ini merupakan kelas utama karena memiliki method main
	 * 
	 */
	
	public static void main (String [] args) {
		Buku book = new Buku();
		book.inputData("Harry Potter", "JK. Rowling", "Erlangga", 200_000);
		System.out.println(book.tampilData());
		
		Buku book2 = new Buku();
		Scanner sc = new Scanner(System.in);
		String judul = sc.next();
		String penulis = sc.next();
		String penerbit = sc.next();
		int harga = sc.nextInt();
		book2.inputData(judul, penulis, penerbit, harga);
		System.out.println(book2.tampilData());
	}
}