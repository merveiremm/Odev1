package ödevler;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj= "     Bugün hava çok güzel.";
		

		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı:" +mesaj.length());
		  System.out.println("7.eleman:"+mesaj.charAt(6) );
		
		  System.out.println(mesaj.concat(" Yaşasın!"));
		 
		  //startswith mesaj o harfle başlıyor mu diye bakmak için. Çıktı true,false olur.
		  System.out.println(mesaj.startsWith("A"));
		  
		//endswith mesaj o harfle bitiyor mu diye bakmak için. Çıktı true,false olur.
		  System.out.println(mesaj.endsWith("."));
		  
		  char[] karakterler= new char [5];
		  mesaj.getChars( 0, 4,karakterler, 0);
		  System.out.println(karakterler);
		  
		  //indexof verilen değer bağlı olduğu ifadede kaçıncı harf.
		  System.out.println(mesaj.indexOf("ava"));
		  //lastindexof verilen değer bağlı olduğu ifadede sondan kaçıncı harf.
		  System.out.println(mesaj.lastIndexOf("a"));
		  
		  //string2......................
		  
		  //önceki ifadedeki neyi neyle değiştirsin. örn.boşluğu "-" ile.
		 String yeniMesaj=(mesaj.replace(" " ,"-"));
		 System.out.println(yeniMesaj);
		 
		 //substring mesajın x.indexinden itibaren parçalıyor.
		 System.out.println(mesaj.substring(2));
		 //substring mesajın x ten y ye kadar olan kısmını almak için.
		 System.out.println(mesaj.substring(2, 4));
		  
		 //split kelimeyi istenen yerden bölüyor, örn.boşluklardan.
		 for( String kelime:mesaj.split(" ")) {
			 System.out.println(kelime);
			 
		  // toLowerCase kelimedeki tüm harfleri küçültür.Upper büyütür.
			 System.out.println(mesaj.toLowerCase());
			 System.out.println(mesaj.toUpperCase() );
			 
			 //trim mesajda başta,sonda olan boşlukları sıfırlar.
			System.out.println(mesaj.trim());
		 }
		  
		  
		  
		}


	}

 
