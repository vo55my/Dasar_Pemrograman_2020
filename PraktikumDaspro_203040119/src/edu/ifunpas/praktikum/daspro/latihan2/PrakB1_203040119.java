package edu.ifunpas.praktikum.daspro.latihan2;

import java.util.Scanner;

public class PrakB1_203040119 {

	public static void main (String [] args) {
		// Program dalam bahasa java yang menghasilkan output data karyawan.
		
        // Deklarasi Variabel
        String nama, alamat;
        int usia, gaji;
        
        // Membuat Scanner Baru
        Scanner keyboard = new Scanner (System.in);
        
        // Tampilkan Output ke User
        System.out.print("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.println("");
        System.out.print("Nama karyawan : ");
        
        // Menggunakan Scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        
        // Tampilkan Output lagi
        System.out.print("Alamat : ");
        
        // Menggunakan Scanner lagi
        alamat = keyboard.nextLine();
        System.out.print("Usia : ");
        usia = keyboard.nextInt();
        System.out.print("Gaji : ");
        gaji = keyboard.nextInt();
        
        // Menampilkan apa yang sudah disimpan di variabel
        System.out.println("");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Gaji : Rp " + gaji);
    }
}