package Latihan09.Kucing.bin;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kucing{
	protected String NAMA;
	protected int UMUR;
	protected int BERAT;
	public void setNama(String Nama){
		NAMA = Nama;
	}
	public void setUmur(int Umur){
		UMUR = Umur;
	}
	public void setBerat(int Berat){
		BERAT = Berat;
	}
	public void Tulis(){
		System.out.println("Nama kucing kesayangan saya  : "+ this.NAMA);
		System.out.println("Umur kucing kesayangan saya  : "+ this.UMUR);
		System.out.println("Berat kucing kesayangan saya : "+ this.BERAT);
	}
	protected static int inputDataInteger(){
		BufferedReader BFR = new BufferedReader(new InputStreamReader(System.	in));
		String angkaInput = null;
		try{
			angkaInput = BFR.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}
	protected static String inputDataString(){
		final BufferedReader BFR = new BufferedReader(new InputStreamReader(System.	in));
		String Input = null;
		try{
			Input = BFR.readLine();
		}catch(final IOException e){
			e.printStackTrace();
		}
		final String Data = String.valueOf(Input);
		return Data;
	}
}