import java.util.Locale;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double m = (n1+n2+n3)/3;
		
		
		System.out.printf("Média %.2f%n", m);
		if (m>=6) {
			System.out.println("aprovado");
			
		}
		if (m>=9) {
			System.out.println("Excelente");
		}
									
		else if (m<6){
			
			m = (6-m);		
			
			System.out.printf("faltou %.2f pontos pra passar %n", m);
			
		}
		
		
		
		sc.close();
	}
}
