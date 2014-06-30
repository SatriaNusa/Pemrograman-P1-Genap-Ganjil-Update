package Praktikum09f.bin;

public class KuliahApply{
	public static void main(String[] satria){
		Dosen DOS = new Dosen("Candra Nursari",45,"Depok","Menikah","007","03","Lektor Kepala",1500000);
		Mahasiswa MH = new Mahasiswa("Fajar Satria",20,"Jakarta","Mahasiswa","451010","2010",3);
		
		System.out.println(DOS.Display());
		System.out.println(MH.Display());
	}
}