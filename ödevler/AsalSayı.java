package ödevler;

public class AsalSayı {

	public static void main(String[] args) {
		int number= 57;
		int remainder= number %2;
		//System.out.println(remainder);
		
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Sayı asal değil");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz");
		}
		
		for(int i=2; i<number; i++){
		  if (number %i==0){
				isPrime=false; 	
		  }
		}
		  		
		if(isPrime==true) {
			System.out.println("Sayı asal");
		}
		
		else {
			System.out.println("Sayı asal değil");
		}
	}

}
