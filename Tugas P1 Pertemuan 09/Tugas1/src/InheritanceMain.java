package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain{
	public static void main(String[] satria) throws ParseException{
		Student s = new Student();
		s.setNim("1221456071");
		s.setNama("Satria Nusa");
		s.setAlamat("Jl. Raya Krukut");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("13-06-1986"));
		s.setNoHp("081122334455");
		
		Employee e = new Employee();
		e.setNip("21100989");
		e.setNama("Adi Sulistiono");
		e.setAlamat("Jl. Asem Jajar No. 6");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("13-06-1986"));
		e.setNoHp("085210831766");
		
		showData(s);
		System.out.println("\n==============================\n");
		showData(s);
	}
	
	static void showData(Student s){
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}
	
	static void showData(Employee e){
		System.out.println("Class Employee");
		System.out.println("NIM : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
	}
}