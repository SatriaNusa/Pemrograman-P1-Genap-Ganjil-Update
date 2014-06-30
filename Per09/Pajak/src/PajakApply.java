package Praktikum09d.bin;

public class PajakApply{
	public static void main(String[] satria){
		Pajak PJK = new Pajak();
		PJK.Pendapatan = 6000000;
		PJK.Propinsi = "Jawa Timur";
		PJK.Kota = "Mojosari-Mojokerto";
		double PajakAnda = PJK.HitungPajak();
		
		PajakProp PJK01 = new PajakProp();
		double PajakAndaProp = PJK01.HitungPjkProp(PajakAnda);
		
		System.out.println("Besar Pajak Anda sebesar       Rp." + PajakAnda);
		System.out.println("Anda Berada di Propinsi        " + PJK.Propinsi);
		System.out.println("Anda di Kota                   " + PJK.Kota);
		System.out.println("Potongan Pajak Anda sebesar    Rp." + PajakAndaProp);
	}
}