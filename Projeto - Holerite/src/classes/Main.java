package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner(System.in);
		
		List<Apoio> funApoio = new ArrayList();
		List<Chefe> funChefe = new ArrayList();
		
		String nome;
		String matricula;
		double salariobase;
		double gratificacaoProd;
		double gratificacaoChefia = 0;
		int nrDependentes;
		int tipoFun;
		int cadastro;
		int x;
		
		System.out.println("--------------- Bem vindx ao You Dev Money ------------------\n\n");
		System.out.println("█──██████────██████──█\r\n"
				+ "█─██────██──██────██─█\r\n"
				+ "─███─██─██████─██─███\r\n"
				+ "──██────██──██────██\r\n"
				+ "───██████────██████\r\n"
				+ "");
		
		System.out.println("\n\n\n\n");
		
		System.out.println("Bom dia, boa tarde, boa noite!\n");
		System.out.println("Deseja cadastrar um funcionário? \n1 - SIM \t 2 - NÃO");
		cadastro = leia.nextInt();
		
		if (cadastro == 1) {
			
			do { 
				
				System.out.println("O funcionário é: \t 1 - Chefe \t 2 - Apoio");
				tipoFun = leia.nextInt();
				
				System.out.print("Digite o nome: ");
				nome = leia.next();
				
				System.out.print("Digite a matricula: ");
				matricula = leia.next();
				
				System.out.print("Digite o Salário Base: ");
				salariobase = leia.nextDouble();
				
				System.out.print("Digite o gratificacao: ");
				gratificacaoProd = leia.nextDouble();
				
				System.out.print("Digite o número de dependentes: ");
				nrDependentes = leia.nextInt();
				
				if(tipoFun == 2) 
				{
					funApoio.add(new Apoio(nome,matricula,salariobase,gratificacaoProd,nrDependentes));
				}
				else 
				{
					funChefe.add(new Chefe(nome,matricula,salariobase,gratificacaoProd,gratificacaoChefia,nrDependentes));
				}
				
				System.out.println("Quer continuar um novo funcionário: \t 1 - Sim \t 2 - Não");
				x = leia.nextInt();
				
				
			}
			while(x != 2);	
			
		}
		
		else { 
			System.out.println("\n\n\n\n");
			System.out.println("▄██████████████▄▐█▄▄▄▄█▌\r\n"
					+ "██████▌▄▌▄▐▐▌███▌▀▀██▀▀\r\n"
					+ "████▄█▌▄▌▄▐▐▌▀███▄▄█▌\r\n"
					+ "▄▄▄▄▄██████████████▀\r\n"
					+ "");
			System.out.println("Sistema encerrado");
		}
		
		
		for (Apoio i: funApoio) {
			
			i.mostrarinformacoes();
		}
		
		for (Chefe i: funChefe) {
			
			i.mostrarinformacoes();
		}
		leia.close();
	}

}

