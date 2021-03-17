package edu.ifunpas.praktikum.daspro.tugas3;

import java.util.Scanner;

public class TugasSatu {

	public static void main (String [] args) {
		// Program dengan bahasa java untuk menghitung Body Mass Index dengan berat badan dan tinggi badan diinputkan melalui keyboard.
		// Rumusnya adalah BMI = Berat Badan / (Tinggi Badan * Tinggi Badan)
		
        Scanner sc = new Scanner(System.in);
        float tinggiBadan, beratBadan, BMI, cm;
        
        System.out.println("Masukkan Berat Badan Anda(kg) : "); beratBadan = sc.nextInt();
        System.out.println("Masukkan Tinggi Badan Anda(cm): "); cm = sc.nextInt();
        
        tinggiBadan = cm/100;
        BMI = beratBadan/(tinggiBadan*tinggiBadan);
        System.out.println("Body Mass Index anda adalah : " + BMI);
        
        if (BMI >= 25 && BMI < 27) {
        	System.out.println("Anda beresiko yang lebih tinggi terhadap penyakit jantung, osteoarthritis, beberapa tipe kanker dan diabetes level 2");
        } else if (BMI < 18) {
        	System.out.println("Anda berisiko tinggi terhadap osteoporosis atau pertanda kesehatan badan tidak baik");
        } else {
        	System.out.println("Sebaiknya anda meminta saran dari dokter Anda untuk memandu dalam program pengaturan rumus berat badan ideal untuk hidup lebih sehat");
        }
    }
}