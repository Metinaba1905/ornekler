import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

System.out.println("Programa ho�geldiniz...");

      Scanner scanner = new Scanner(System.in);  
      System.out.print("Matematik notu :");
      int mat =scanner.nextInt();

   System.out.println("Fizik notu :");
      int fizik =scanner.nextInt();
      
      System.out.println("Kimya notu :");
      int kimya =scanner.nextInt();
      
      System.out.println("Biyoloji  notu :");
 
      int biyo =scanner.nextInt();
      
      
      System.out.println("T�rk�e notu :");

      int turkce =scanner.nextInt();
      
      int toplam = (mat+ turkce+fizik+kimya+biyo);
      
      double sonuc = toplam/ 5;
   if (sonuc>= 60) {
	System.out.println("Ge�tiniz....");
}
   else {
	System.out.println("Kald�n�z...");
}
      
	}

}
