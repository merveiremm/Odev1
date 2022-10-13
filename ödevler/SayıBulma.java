package ödevler;

import java.util.Iterator;

public class SayıBulma {

	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacakSayi=6;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if(sayi==aranacakSayi) {
				varMi=true;
				break;
			}
			
			
		}if(varMi) {
		System.out.println("sayı var.");
		}
		else {
		System.out.println("sayı yok.");
		}
	}

}
