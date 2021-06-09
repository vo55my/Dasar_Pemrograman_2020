package edu.ifunpas.praktikum.daspro.tugas2;

import java.util.Scanner;

public class TugasDua {

	public static void main (String [] args) {
		// Program dengan bahasa java untuk menghitung Body Mass Index dengan berat badan dan tinggi badan diinputkan melalui keyboard.
		// Rumusnya adalah BMI = Berat Badan / (Tinggi Badan * Tinggi Badan)
		
        Scanner sc = new Scanner(System.in);
        float tinggiBadan, beratBadan, BMI, cm;
        
        System.out.print("Masukkan Berat Badan Anda (kg) : ");
        beratBadan = sc.nextInt();
        System.out.print("Masukkan Tinggi Badan Anda (cm): ");
        cm = sc.nextInt();
        
        tinggiBadan = cm/100;
        BMI = beratBadan/(tinggiBadan * tinggiBadan);
        System.out.println("Body Mass Index anda adalah : " + BMI);
    }
}