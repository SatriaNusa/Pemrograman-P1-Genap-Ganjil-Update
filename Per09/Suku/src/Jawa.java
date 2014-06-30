package Praktikum09c.bin;

public class Jawa extends SukuInd{
	private double GAJI;
	public Jawa(String Nama, String Alamat, String Hobby, String Pekerjaan){
		super(Nama, Alamat, Hobby, Pekerjaan);
	}
	
	public double getGAJI(){
		return this.GAJI;
	}
	
	public void setGAJI(double Gaji){
		this.GAJI = Gaji;
	}
	
	public String THR(double persen){
		if(persen > 500000)
			return "Gaji ke 13 Terlalu Besar !!!";
		else
			return "Gaji ke 13 Sebesar " + persen * GAJI;
	}
	
	public String THR(long persen){
		if(persen > 500000)
			return "Gaji ke 13 Terlalu Besar !!!";
		else
			return "Gaji ke 13 Sebesar " + (persen * GAJI / 100);
	}
}