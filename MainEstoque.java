package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstoque {

	public static void main(String[] args) {

		ArrayList <Produto> prod = new ArrayList<Produto>();
		Scanner sc = new Scanner(System.in);
		int escolher = -1;
		
		System.out.println("Bem vindo!");
		while(escolher != 0) {
			System.out.println("\nEscolha uma das opções: \n1 - Adicionar Produtos "
					+ "\n2 - Remover Produtos \n3 - Alterar Produtos + \n4 - Mostrar a lista de Produtos");
			System.out.print("Opção -> ");
			escolher = sc.nextInt();
			sc.nextLine();
			
			switch (escolher) {
			case 1:
				System.out.println("\nDigite o nome do produto: ");
				String nome = sc.nextLine();
				System.out.println("\nDigite o valor: ");
				double preco = sc.nextDouble();
				
				prod.add(new Produto(nome, preco));			
				
				System.out.println("\nProduto " + nome + ", adicionado!");
				break;
			
			case 2:
				System.out.println("\nDigite o nome do produto para ser removido: ");
				nome = sc.nextLine();
				for(int i = 0; i < prod.size();i++) {
					if(prod.get(i).getNproduto().equals(nome)) {
						prod.remove(i);
						System.out.println("\nProduto " + nome + " removido com sucesso");
					}
				}
				break;
			case 3:
				System.out.println("Digite o produto que será alterado: ");
				nome = sc.nextLine();
				for(int i = 0; i < prod.size();i++) {
					if(prod.get(i).getNproduto().equals(nome)) {
						System.out.println("O produto " + nome + " foi encontrado. \nDigite o novo nome: ");
						nome = sc.nextLine();
						System.out.println("Agora digite um novo valor: ");
						preco = sc.nextDouble();
						prod.get(i).setPreco(preco);
						prod.get(i).setNproduto(nome);
						System.out.println("\nO produto foi atualizado: \nNome " + nome + " no preço de " + preco);
						
					}
					System.out.println("\n ");
				}
				break;
				
			case 4:
				System.out.println("PRODUTOS");
				for(int i = 0; i < prod.size();i++) {
					System.out.println("Produto: " + prod.get(i).getNproduto() + "\nPreço: R$" + prod.get(i).getPreco());
				}
				break;
			case 0:
				System.out.println("Encerrando programa!");
				break;
			
			default:
				System.out.println("Valor incorreto");
			}
		}
		
		sc.close();
		
	}

}
