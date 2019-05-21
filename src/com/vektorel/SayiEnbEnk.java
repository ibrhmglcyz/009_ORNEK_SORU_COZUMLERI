package com.vektorel;

import java.util.Scanner;

public class SayiEnbEnk {

	public static void main(String[] args) {
		
		
		// Kullanicidan 6 adet sayi/rakam alip en buyuk ve en kucuk degerini ekrana yazdiriniz.
		
		
		int[] sayilar;
		int enk,enb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç Sayı girilecek..:");
		int s1 = sc.nextInt();
		sayilar = new int[s1];
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println((i+1)+". sayıyı giriniz..:");
			sayilar[i]= sc.nextInt();
		}
		enk = sayilar[0];
		enb = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			if(enk>sayilar[i])
				enk = sayilar[i];
			if(enb<sayilar[i])
				enb = sayilar[i];
		}
		
		System.out.println("en küçük Sayı..: "+enk);
		System.out.println("en Büyük Sayı..: "+enb);
		

	}

}
