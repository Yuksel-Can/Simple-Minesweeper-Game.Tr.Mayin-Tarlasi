package mayinTarlasiBasic;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

	private int rowSize;
	private int colSize;
	private int size;
	int [][] map;
	int [][] board;
	boolean game=true;
	
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public MayinTarlasi(int rowSize, int colSize) {
		this.rowSize = rowSize;
		this.colSize = colSize;
		this.map = new int[rowSize][colSize];
		this.board = new int[rowSize][colSize];
		this.size = rowSize*colSize;
		System.out.println("Tarla Ebatý Oluþtu");
	}
	
	public void run() {
		createGame();
		printMap(map);
		System.out.println("Oyun baþladý");
		int setRow, setCol;
		int success=0;
		while(game) {
			System.out.print("Satýr: ");
			setRow=scanner.nextInt();
			System.out.print("Sütun: ");
			setCol=scanner.nextInt();
			
			if(!(setRow<=rowSize && setCol<=colSize && setRow>=0 && setCol>=0)) {
				System.out.println("Lütfen Geçerli Bir deðer giriniz !");
				continue;
			}
			
			else if(map[setRow][setCol] == -1) {
				game=false;
				printGameEnd(map,board);
				System.out.println("Oyunu Kaybettin");
				
				
			}else if(board[setRow][setCol] == 0){
				System.out.println("Baþarýlý, devam");
				checkMine(setRow, setCol);
				printMap(board);
				success++;
				if(success==size-(size/4)) {
					System.out.println("Oyunu KAZANDINIZ !!!");
					break;
				}
			}else {
				System.out.println("Daha önceden basýlmýþ alan !");
			}
		}
	}
	
	public void createGame() {
		// 1/9 kadar mayýn olabilir
		int randRow, randCol;
		int count=0;
		
		while(count != this.size/4) {
			randRow = random.nextInt(rowSize);
			randCol = random.nextInt(colSize);
			
			if(map[randRow][randCol] != -1) {
				map[randRow][randCol] = -1;
				count++;
			}
		}
		System.out.println("Tarla  Oluþtu");

	}
	
	public void printMap(int[][] map) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j < map[0].length;j++) {
				if(map[i][j] >=0) {
					System.out.print(" ");
				}
				System.out.print(map[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public void checkMine(int row, int col) {
		int warning=0;
		for(int i =-1;i<2;i++) {
			for(int j=-1;j<2;j++) {
				if(row+i>=0 && col+j>=0 && map.length >row+i && map[0].length>col+j) {
					if(map[row+i][col+j] == -1) {
						warning++;
					}
				}
			}
		}
		if(warning !=0) {
			board[row][col]=warning;
		}else {
			board[row][col]=-2;
		}
	}
	
	public void printGameEnd(int[][] map,int[][] board) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j < map[0].length;j++) {
				if(map[i][j] >=0) {
					System.out.print(" ");
				}else if(map[i][j] == -1) {
					board[i][j] = -1;
				}
				
				System.out.print(board[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
