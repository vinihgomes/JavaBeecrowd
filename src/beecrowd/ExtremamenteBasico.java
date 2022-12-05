package beecrowd;
import java.util.Scanner;

public class ExtremamenteBasico {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int A, B;
		System.out.println("Informe o valor de A: ");
		A = ler.nextInt();
		System.out.println("Informe o valor de B: ");
		B = ler.nextInt();
		System.out.println("X = " + (A+B));
	}
}
