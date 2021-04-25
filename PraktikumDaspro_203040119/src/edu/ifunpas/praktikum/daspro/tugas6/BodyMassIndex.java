package edu.ifunpas.praktikum.daspro.tugas6;

public class BodyMassIndex {

	private String nama;
	private int umur;
	private float cm;
	private float TinggiBadan;
	private float BeratBadan;
	private float BMI;
	
	public void setnama (String nama) {
		this.nama = nama;
	}
	public String getnama() {
		return nama;
	}
	
	public void setumur (int umur) {
		this.umur = umur;
	}
	public int getumur() {
		return umur;
	}
	
	public void setcm (float cm) {
		this.cm = cm;
	}
	public float getcm() {
		return cm;
	}
	
	public void setTinggiBadan (float TinggiBadan) {
		this.TinggiBadan = TinggiBadan;
	}
	public float getTinggiBadan() {
		return TinggiBadan;
	}
	
	public void setBeratBadan (float BeratBadan) {
		this.BeratBadan = BeratBadan;
	}
	public float getBeratBadan() {
		return BeratBadan;
	}
	
	public void setBMI (float BMI) {
		this.BMI = BMI;
	}
	public float getBMI() {
		return BMI;
	}
}