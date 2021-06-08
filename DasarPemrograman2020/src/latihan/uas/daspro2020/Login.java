package latihan.uas.daspro2020;

import java.util.Scanner;

public class Login {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String username, password;
		int loop = 0;
		
		for (; loop < 3; loop++) {
			System.out.println("Login");
			System.out.print("Masukkan Username : ");
			username = sc.next();
			System.out.print("Masukkan Password : ");
			password = sc.next();
			
			if (username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("12345")) {
				System.out.println("Selamat Datang");
				break;
				} else {
				System.out.println("Maaf Anda Gagal");
			}
		}
		if (loop == 3) {
			System.out.println("Maaf Anda Gagal dalam sesi Login, Silahkan mencoba lain waktu");
		}
	}
}