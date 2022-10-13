package ödevler;

public class Diziler {

	public static void main(String[] args) {
	  String ogrenci1="Ali";
	  String ogrenci2="Veli";
	  String ogrenci3="Ahmet";
	  
	  System.out.println(ogrenci1);
	  System.out.println(ogrenci2);
	  System.out.println(ogrenci3);
	  
	  System.out.println("...........");
	  
	  String[] ogrenciler = new String[2];
	  ogrenciler[0]="Ali";
	  ogrenciler[1]="Veli";
	  
	  
	  
	  for(int i=0; i<ogrenciler.length; i++) {
	   System.out.println(ogrenciler [i]);
	}
	  
	  System.out.println("............");
	 for(String ogrenci: ogrenciler) {
		 System.out.println(ogrenci);
	 }
  }
}
