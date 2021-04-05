package pertemuan8.daspro2020;

import java.util.Scanner;

public class BilanganFactorial {
	
		/*
		 * faktorial = adalah hasil perkalian antara bilangan bulat
		 * positif yang kurang dari atau sama dengan n.
		 * Faktorial ditulis sebagai n!
		 * Bentuk dari n faktorial juga bisa ditulis sebagai berikut
		  
		   n! = 1 x 2 x _ x (n-2) x (n-1) x n
		   
		   Berikut ini adalah faktorial 0 sampai faktorial 10
		   
		   0! = 1
		   1! = 1
		   2! = 1 x 2 = 2
		   3! = 1 x 2 x 3 = 6
		   4! = 1 x 2 x 3 x 4 = 24
		   5! = 1 x 2 x 3 x 4 x 5 = 120
		   6! = 1 x 2 x 3 x 4 x 5 x 6 = 720
		   7! = 1 x 2 x 3 x 4 x 5 x 6 x 7 = 5040
		   8! = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 = 40320
		   9! = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 = 362880
		   10! = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 x 10 = 3628800
		   
		 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Anda ingin melakukan berapa faktorial : ");
		int faktorial = sc.nextInt();
		int hasil = 1;
		
		for (int a=1; a<= faktorial; a++) {
			System.out.println(hasil + " X " + a);
			hasil = hasil * a;
		}
		
		System.out.print("Hasilnya adalah "+ hasil);
	}
}