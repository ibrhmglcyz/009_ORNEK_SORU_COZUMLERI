package com.vektorel;

import java.util.Scanner;

public class YildizSoru {

	public static void main(String[] args) {
		
		//Yildizi sonsuz donguye alip hareket ettirme.
		
		
		int konumX=3,konumY=5;
		int sekilBoyutu=6;		
		do {
		for (int i = 0; i < sekilBoyutu; i++) {
			
			for (int j = 0; j < sekilBoyutu; j++) {
				if(i==konumX && j==konumY)
					System.out.print("* ");
				else
					System.out.print(". ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Hareket Yönü giriniz...:");
		Scanner sc = new Scanner(System.in);
		int yon = sc.nextInt();
		if(yon==4){
			if(konumY==0)
				konumY=sekilBoyutu-1;
			else
				konumY--;
		}
		else if(yon==6) {
			if(konumY==sekilBoyutu-1)
				konumY=0;
			else
				konumY++;
		}
		if(yon==8){
			if(konumX==0)
				konumX=sekilBoyutu-1;
			else
				konumX--;
		}
		else if(yon==2) {
			if(konumX==sekilBoyutu-1)
				konumX=0;
			else
				konumX++;
		}
		
		}while(true);

	}

}
