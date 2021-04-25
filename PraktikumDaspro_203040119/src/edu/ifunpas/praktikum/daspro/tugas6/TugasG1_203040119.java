package edu.ifunpas.praktikum.daspro.tugas6;

import java.util.Scanner;

public class TugasG1_203040119 {

	public static void main (String [] args) {
		BodyMassIndex bmi = new BodyMassIndex();
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda  : ");
       	String nama = sc.next();
       	bmi.setnama(nama);
        	
       	System.out.print("Masukkan Umur Anda  : ");
        int umur = sc.nextInt();
        bmi.setumur(umur);
        	
        System.out.print("Masukkan Tinggi Badan Anda (cm)  : ");
        float cm = sc.nextInt();
        bmi.setcm(cm);
        	
        System.out.print("Masukkan Berat Badan Anda (cm) : ");
        float BeratBadan = sc.nextInt();
        bmi.setBeratBadan(BeratBadan);
        	
	    float TinggiBadan = cm/100;
	    bmi.setTinggiBadan(TinggiBadan);
	    float BMI = BeratBadan/(TinggiBadan*TinggiBadan);
	    bmi.setBMI(BMI);
	    
	    System.out.println("");
	    System.out.println("Nama : " + bmi.getnama());
	    System.out.println("Umur : " + bmi.getumur()+ " Tahun");
	    System.out.println("Tinggi Badan : " + bmi.getTinggiBadan() + "m");
	    System.out.println("Berat Badan : " + bmi.getBeratBadan() + "kg");
	    System.out.println("Body Mass Index anda adalah : " + bmi.getBMI());
	    System.out.println("");
	        
	    if (BMI >= 25 && BMI < 27) {
	        System.out.println("Anda beresiko yang lebih tinggi terhadap penyakit jantung, osteoarthritis, beberapa tipe kanker dan diabetes level 2");
	    } else if (BMI < 18) {
	        System.out.println("Anda berisiko tinggi terhadap osteoporosis atau pertanda kesehatan badan tidak baik");
	    } else {
	        System.out.println("Sebaiknya anda meminta saran dari dokter Anda untuk memandu dalam program pengaturan rumus berat badan ideal untuk hidup lebih sehat");
	    }
    }
}