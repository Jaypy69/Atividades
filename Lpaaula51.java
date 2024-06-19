package LPAlore;
import java.util.Scanner;
public class Lpaaula51 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	 int Número;
	 for(int i=1; 1<=20; i++) {
     System.out.print("Coloque o " + i + " número do usuário");
     Número = ler.nextInt();
     String mensagem = Número >= 8 ? "Maior que 8" : "Menor que 8";
     System.out.println(mensagem);
	 }
		}
	}



