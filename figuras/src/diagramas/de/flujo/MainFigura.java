package diagramas.de.flujo;
import java.util.Scanner;
public class MainFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Excelente trabajo compa
		
		System.out.println("Ingrese el número de filas: ");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		for (int f = 1; f <= N; f++) {

			for (int as = 1; as <= f; as++) {

				System.out.print("*");
				}

			System.out.println(" ");
			}
	}

}
