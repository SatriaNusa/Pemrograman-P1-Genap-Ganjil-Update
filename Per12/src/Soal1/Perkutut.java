package Praktikum12a.bin;

class Perkutut extends Hewan{
	public Perkutut(){
		super("perkutut",2,true);
	}
	public void bersuara(){
		System.out.println("\ncuit, cuit, cuit");
	}
	public static void main(String[] satria){
		Perkutut p = new Perkutut();
		p.isHewan();
		p.bersuara();
	}
}