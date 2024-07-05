import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if (hora >= 12 && hora <= 17) {
			System.out.println("Boa Tarde!");
		} else if (hora >= 0 && hora <= 11) {
				System.out.println("Bom dia!");
        } else {
            System.out.println("Boa noite!");
        }
		
		sc.close();
	}

}
