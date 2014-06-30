package Praktikum12a.bin;

class Sapi extends Hewan{
	public Sapi(){
		super("sapi",4,false);
	}
	public void bersuara(){
		System.out.println("\nemoh..., emoh...");
	}
	public static void main(String[] satria){
		Sapi s = new Sapi();
		s.isHewan();
		s.bersuara();
	}
}