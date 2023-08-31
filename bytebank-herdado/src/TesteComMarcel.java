import java.util.Scanner;

public class TesteComMarcel {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int idade;
		System.out.println("Quantos anos você tem?");
		idade = entrada.nextInt();
		if(idade == 20) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou");
		}
		
		entrada.close();
		
	
	}

}
