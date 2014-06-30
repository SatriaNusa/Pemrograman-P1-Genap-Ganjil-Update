package Praktikum12a.bin;

class Spongebob extends Hewan implements Manusia{
	public Spongebob(){
		super("sponge bob",2,false);
	}
	public void bersuara(){
		System.out.println("\nhallo patrict...");
	}
	public void menyanyi(){
		System.out.println("nye, nye, nye, wik, wik, wik");
	}
	public void ketawa(){
		System.out.println("kek, kek, kek");
	}
	public static void makan(){
		System.out.println("uenak tenan...");
	}
	public void makan2(){
		super.makan();
	}
	public static void main(String[] satria){
		Spongebob s = new Spongebob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
	}
}