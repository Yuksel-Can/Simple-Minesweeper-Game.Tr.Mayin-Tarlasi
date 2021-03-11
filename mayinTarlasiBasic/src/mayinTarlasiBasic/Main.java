package mayinTarlasiBasic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Mayýn Tarlasý Oyunumuza Hoþgeldiniz");
		System.out.println("Lütfen Oynamak Ýstediðiniz Boyutlarý giriniz");
		System.out.print("Satýr : ");
		int getRow = scan.nextInt();
		System.out.print("Sütun : ");
		int getCol = scan.nextInt();
		if(getRow>=0 && getCol >=0) {
			MayinTarlasi mayinTarlasi = new MayinTarlasi(getRow,getCol);
			mayinTarlasi.run();
		}else {
			System.out.println("Geçersiz Deðer Girdiniz !");
		}
		//MayinTarlasi mayinTarlasi = new MayinTarlasi(getRow,getCol);
		//mayinTarlasi.run();
		*/
		
		MayinTarlasi mayinTarlasi = new MayinTarlasi();
		mayinTarlasi.start();
		
		
	}
	

}
