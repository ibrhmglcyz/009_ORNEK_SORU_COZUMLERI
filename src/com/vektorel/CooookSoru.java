package com.vektorel;

public class CooookSoru {

	public static void main(String[] args) {
		
		// bugun hava cok soguk, ancak ilerleyen
		// gunlerde cok sicak olacak, cok kelimesini
		// neden bu kadar cok kullandim??
		
		// Soru: cok kelimelerinin bulundugu index 
		// numaralarini bulup ekrana yazdiriniz.
		
		String ifade = "bugün hava çok soğuk, ancak ilerleyen günlerde çok sıcak olacak, çok kelimesini neden bu kadar çok kullandım??";
		String arananifade = "çok";
		String tmp = ifade;
		int kesilenuzunluk=0;
		int ilkIndex=-1;
		do {
		ilkIndex = tmp.indexOf(arananifade);
			if(ilkIndex>=0) {
			int reelIndex = kesilenuzunluk + ilkIndex;
			System.out.println("bulunan index..: "+reelIndex);
			tmp = tmp.substring(ilkIndex+3, tmp.length());
			kesilenuzunluk += ilkIndex+3;	
			}
		}while(ilkIndex>=0);
		

	}

}
