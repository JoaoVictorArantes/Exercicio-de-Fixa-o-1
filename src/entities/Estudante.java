/**
 * 
 */
package entities;

import java.text.DecimalFormat;

/**
 * @author João Victor Almeida Arantes
 *
 */
public class Estudante {

	public static final DecimalFormat formato = new DecimalFormat("0.00");
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaTotal () {
		 return nota1 + nota2 + nota3;
	}
	
	public double notaFaltando() {
		if (notaTotal() > 60 ) {
			return 0;
		} else {
			return 60 - notaTotal();
		}
	}
	
	public void mostraResultado() {
		if (notaTotal() < 60) {
			System.out.println("Nota final: " + formato.format(notaTotal()));
			System.out.println("Reprovado. \nFaltaram: " + formato.format(notaFaltando()) + " pontos.");
		} else {
			System.out.println("Nota final: " + formato.format(notaTotal()));
			System.out.println("Aprovado");
		}
	}
}
