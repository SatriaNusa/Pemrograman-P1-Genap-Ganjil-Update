package model;

import java.io.*;

public class TryCatchException{
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] satria){
		try{
			System.out.println("Choose one of the options, (1-3) " +
								"\n\t1.) Steak" + "\n\t2.) Lobster" +
								"\n\t3.) Cheeseburger");
			
			System.out.println("Masukan Pilihan Anda : ");
			
			String choose = input.readLine();
			if(choose.equals("1")){
				System.out.println("Anda memilih Steak :-)");
			} else if(choose.equals("2")){
				System.out.println("Anda memilih Lobster :-D");
			} else if(choose.equals("3")){
				System.out.println("Anda memilih Cheeseburger ;-)");
			} else {
				throw new Exception("Pilihan anda tidak ada!");
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}