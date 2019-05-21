package com.vektorel;

import java.util.Scanner;

public class MetindenIslemYapmak {

	public static void main(String[] args) {
		
		// 5 ile 10 toplami +
		//          carpimi *
		//          bolumu /
		//          farki -
		// ifadelerini kullanarak kullanicidan islem alabilme. 
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("İfade giriniz...: ");
		String ifade = "5 ile 9 un toplamı nedir?";
		ifade = sc.nextLine();
		
		int sayi1=0, sayi2=0;
		//0 -> toplama
		//1 -> çıkartma
		//2 -> çarpma
		//3 -> bölme
		int islem=0;
		int durum=0;
		for (int i = 0; i < ifade.split(" ").length; i++) {

			String gelendeger = ifade.split(" ")[i];
			char gelenchar = gelendeger.charAt(0);
		    int gelenint = (int)gelenchar;
		    if(gelenint>=48 && gelenint<=57)
		    {
		    	if(durum==0) {
		    		sayi1= Integer.parseInt(gelendeger);
		    		durum=1;
		    	}
		    	else {
		    		sayi2= Integer.parseInt(gelendeger);
		    	}
		    }
		  // String ifade = "5 ile 9 un toplamı nedir?";
		    if(gelendeger.contains("topla"))
		    	islem=0;
		    else if(gelendeger.contains("carp"))
		    	islem=2;
		    else if(gelendeger.contains("bol"))
		    	islem=3;
		    else if(gelendeger.contains("fark"))
		    	islem=1;
		    
		}
		
		switch (islem) {
		case 0:
			System.out.println("İki Sayının Toplamı..:"
						+(sayi1+sayi2));	break;
		case 1:
			System.out.println("İki Sayının Farkı..:"
						+(sayi1-sayi2));	break;
		case 2:
			System.out.println("İki Sayının Çarpımı..:"
						+(sayi1*sayi2));	break;
		case 3:
			System.out.println("İki Sayının Bölümü..:"
						+(sayi1/sayi2));	break;
		default:
			break;
		}

	
	
	
	
	}

}
