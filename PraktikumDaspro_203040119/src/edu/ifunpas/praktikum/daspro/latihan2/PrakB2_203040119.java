package edu.ifunpas.praktikum.daspro.latihan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrakB2_203040119 {

	public static void main (String [] args) throws IOException {
		// Program dalam bahasa java yang menghasilkan output nama.
		
        String nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Inputkan Nama : ");
        nama = br.readLine();
        
        System.out.println("Nama kamu adalah : " + nama);
        System.out.println("");
    }
}