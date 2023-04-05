/**
 * 
 */
package application;

import java.util.Scanner;

import entities.Empregado;
import entities.Estudante;
import entities.Retangulo;

/**
 * @author João Victor Almeida Arantes
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int aux2 = 4;

		do {

			System.out.print("1 = exercicio do retangulo \n2 = exercicio do empregado \n3 = Exercicio do Estudante \n(digite algo diferente das opções acima para sair) \n Qual opção você deseja: ");

			int aux = scanner.nextInt();

			switch (aux) {
				case 1: {
					/*
					 * Fazer um programa para ler os valores da largura e altura de um retangulo. Em
					 * seguida, mostrar na tela o valor de seua área, perímetro e diagonal.
					 */
					Retangulo retangulo1 = new Retangulo();
	
					System.out.println("Digite o valor da base do Retangulo: ");
					retangulo1.base = scanner.nextDouble();
	
					System.out.println("Insira o valor da altura do Retangulo: ");
					retangulo1.altura = scanner.nextDouble();
	
					System.out.println("Area: " + retangulo1.area() + "\nPerimetro: " + retangulo1.perimetro()
							+ "\nDiagonal:" + retangulo1.diagonal());
	
					break;
					// scanner.close();
				}
	
				case 2: {
	
					/*
					 * Fazer um programa para ler dados de um funcionário(nome, salario bruto e
					 * imposto). Em seguida, mostrar os dados do funcionário(nome e salario
					 * liquido). Em seguida, aumentar o salário do funcionario com base em uma
					 * porcentagem dada(somente o salario bruto é afetado pela porcentagem) e
					 * mostrar novamente os dados do funcionario.
					 */
					Empregado empregado1 = new Empregado();
	
					System.out.println("Nome:");
					empregado1.nome = scanner.next();
	
					System.out.println("Salario: ");
					empregado1.salarioBruto = scanner.nextDouble();
	
					System.out.println("Immposto: ");
					empregado1.imposto = scanner.nextDouble();
	
					System.out.println("Empregado: " + empregado1);
	
					System.out.println("Qual a porcentagem de aumento para o salário? ");
					double aumento = scanner.nextDouble();
	
					empregado1.aumentoSalario(aumento);
	
					System.out.println("Empregado: " + empregado1);
					break;
				}
	
				case 3: {
					/*
					 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
					 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
					 * 35). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o
					 * aluno está aprovado (pass) ou (failed) e, em caso negativo, quantos opontos
					 * faltam para o aluno obter o minimo para ser aprovado (que é 60% da nota).
					 * Criar uma classe Estudante para resolver este problema.
					 * 
					 */
					Estudante aluno = new Estudante();
	
					System.out.println("Digite o nome do aluno: ");
					aluno.nome = scanner.next();
	
					System.out.println("Digite a nota do primeiro semestre: ");
					aluno.nota1 = scanner.nextDouble();
	
					System.out.println("Digite a nota do segundo trimestre: ");
					aluno.nota2 = scanner.nextDouble();
	
					System.out.println("Digite a nota do terceiro trimestre: ");
					aluno.nota3 = scanner.nextDouble();
	
					aluno.mostraResultado();
					break;
				}

			}

		} while ((aux2 == 1) || (aux2 == 2) || (aux2 == 3));

		System.out.println("Fim do programa");
		scanner.close();

	}

}
