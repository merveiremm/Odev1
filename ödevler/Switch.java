package ödevler;

public class Switch {

	public static void main(String[] args) {
		char grade = 'B';
		//char değeri küçük harfle
		
	   switch (grade) {
		 case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		 case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		 case 'C':
			System.out.println("Fena değil : Geçtiniz");
			break;
		 case 'D':
			System.out.println("Malesef kaldınız");
			break;
		 default:
			System.out.println("Geçersiz not girdiniz");
	   }
	}

}
