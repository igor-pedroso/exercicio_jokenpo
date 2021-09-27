package PedraPapelTesoura;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			int Jogador,Computador;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("__Jokenpô__");
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.println("Digite a opção desejada:");
			
			//LÓGICA DO JOGADOR
			Jogador = teclado.nextInt();
			System.out.println("");
			switch(Jogador) {
			case 1:
				System.out.println("Jogador escolheu PEDRA");
				break;
			case 2:
				System.out.println("Jogador escolheu PAPEL");
				break;
			case 3:
				System.out.println("Jogador escolheu TESOURA");
				break;
				default:
				System.out.println("Opção inválida");
				break;
			}	
			
			//LÓGICA DO COMPUTADOR
				Computador = (int)(Math.random()*3 + 1);
				
				teclado.close();
				
				switch(Computador) {
				case 1:
					System.out.println("Computador escolheu PEDRA");
					break;
				case 2:
					System.out.println("Computador escolheu PAPEL");
					break;
				case 3:
					System.out.println("Computador escolheu TESOURA");
					break;
				}
				//	lÓGICA DO VENCEDOR
				System.out.println("");
				if (Jogador == Computador) {
					System.out.println("EMPATE");	
				}else {
					if((Jogador == 1 && Computador == 3) || (Jogador == 2 && Computador == 1) || (Jogador == 3 && Computador == 2)) {
						
				System.out.println("Jogador VENCEU");
				System.out.println("Computador PERDEU");
				}else {
					System.out.println("Computador VENCEU");
					System.out.println("Jogador PERDEU");
					
			}
		}
	}
}
