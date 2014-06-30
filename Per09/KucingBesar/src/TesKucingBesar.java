package Latihan09.KucingBesar.bin;

public class TesKucingBesar{
	public static void main(String[] satria){
		Singa mySinga = new Singa("SIMBARA SURAI");
		System.out.println("Singa merupakan " + Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau("HARIMAU SUMATERA");
		System.out.println("Harimau merupakan " + Harimau.nama);
		myHarimau.Makan();
	}
}