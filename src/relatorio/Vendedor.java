package relatorio;

import java.util.Scanner;
import dados_vendedor.Ficha;

public class Vendedor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Nome do vendedor: ");
		String nome = sc.nextLine();
		System.out.println("Salário fixo em R$: ");
		double fixo = sc.nextDouble();
		System.out.println("Total de vendas em R$: ");
		double vendas = sc.nextDouble();
		double comissao = vendas * 0.15;
		
		Ficha vendedor = new Ficha();
		
		System.out.println("Vendedor: " + vendedor.nomeVendedor(nome));
		System.out.println("Salário bruto: R$" + String.format("%.2f", fixo));
		System.out.println("Total vendas: R$" + String.format("%.2f", vendas));
		System.out.println("Comissão: R$" + String.format("%.2f", comissao));
		System.out.println("Salário final: R$" + String.format("%.2f", vendedor.salario(fixo, vendas)));
		
		
		sc.close();
	}

}
