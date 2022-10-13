package ödevler;

public class SeslİnceHarf {

	public static void main(String[] args) {
		char harf = 'M';
		
		switch (harf) {
		case 'A', 'I', 'O', 'U':
			System.out.println("sesli kalın harf");
		break;
		
		case 'E', 'İ', 'Ö', 'Ü':
			System.out.println("sesli ince harf");
		break;
		
		default:
			System.out.println("sesli harf değil,geçersiz.");
	
		
		
		}
	
		
		
		
		

	}

}
