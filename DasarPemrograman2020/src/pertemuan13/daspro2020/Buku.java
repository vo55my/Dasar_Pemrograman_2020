package pertemuan13.daspro2020;

public class Buku {

	/*
	 * kelas record dari object buku
	 * kita buat field
	 */
	
	private String sJudul;
	private String sPenulis;
	private String sPenerbit;
	private int iHarga;
	
	public void inputData (String judul, String penulis, String penerbit, int harga) {
		sJudul = judul;
		sPenulis = penulis;
		sPenerbit = penerbit;
		iHarga = harga;
	}
	
	public String tampilData() {
		return sJudul + " diterbitkan oleh " + sPenerbit + " ditulis oleh " + sPenulis + " dengan harga " + iHarga;
	}
}