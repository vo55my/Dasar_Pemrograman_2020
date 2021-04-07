package latihan.uts.daspro2020;

import java.util.Scanner;

public class NomorDuaUTS {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
        float tinggiBadan, beratBadan, BMI, cm;
        
        System.out.print("Masukkan Berat Badan Anda (kg) : ");
        beratBadan = sc.nextInt();
        System.out.print("Masukkan Tinggi Badan Anda (cm): ");
        cm = sc.nextInt();
        
        tinggiBadan = cm/100;
        BMI = beratBadan/(tinggiBadan*tinggiBadan);
        System.out.println("Tinggi Badan anda adalah : " + tinggiBadan);
        System.out.println("Berat Badan anda adalah : " + beratBadan);
        System.out.println("Body Mass Index anda adalah : " + BMI);
        
        if (BMI < 18.5) {
        	System.out.println("Berat Badan Kurang");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
        	System.out.println("Berat Badan Normal");
        } else if (BMI >= 25 && BMI <= 29.9) {
        	System.out.println("Berat Badan Berlebih");
        } else {
        	System.out.println("Obesitas");
        }
	}
}