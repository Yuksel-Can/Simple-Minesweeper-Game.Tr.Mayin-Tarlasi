package mayinTarlasiBasic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("May�n Tarlas� Oyunumuza Ho�geldiniz");
		System.out.println("L�tfen Oynamak �stedi�iniz Boyutlar� giriniz");
		System.out.print("Sat�r : ");
		int getRow = scan.nextInt();
		System.out.print("S�tun : ");
		int getCol = scan.nextInt();
		if(getRow>=0 && getCol >=0) {
			MayinTarlasi mayinTarlasi = new MayinTarlasi(getRow,getCol);
			mayinTarlasi.run();
		}else {
			System.out.println("Ge�ersiz De�er Girdiniz !");
		}
		//MayinTarlasi mayinTarlasi = new MayinTarlasi(getRow,getCol);
		//mayinTarlasi.run();
		*/
		
		MayinTarlasi mayinTarlasi = new MayinTarlasi();
		mayinTarlasi.start();
		
		
	}
	

}
