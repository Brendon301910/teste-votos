package brendon.votos;

import java.util.Scanner;

public class Electors {
	
	public static void main(String[] args) {
		int totalEleitores, validos, votosBrancos, votosNulos;
		double pctVa, pctVb, pctVn;
		Scanner tela = new Scanner(System.in);
		
		
		System.out.println("Digite o total de eleitores");
		totalEleitores = tela.nextInt();
		
		System.out.println("Digite o total de votos válidos");
		validos = tela.nextInt();
		
		System.out.println("Digite o total de votos em branco");
		votosBrancos = tela.nextInt();
		
		System.out.println("Digite o total de votos nulos");
		votosNulos = tela.nextInt();
		
		pctVa = ((double)validos / totalEleitores ) * 100;
		pctVb = ((double)votosBrancos / totalEleitores ) * 100;
		pctVn = ((double)votosNulos / totalEleitores ) * 100;
		
		System.out.println("Porcentagem de válidos: "+pctVa+"%");
		System.out.println("Porcentagem de brancos: "+pctVb+"%");
		System.out.println("Porcentagem de nulos: "+pctVn+"%");
	}
		
	
}
