/**
 * 
 */
package entities;

import java.text.DecimalFormat;

/**
 * @author João Victor Almeida Arantes
 *
 */
public class Empregado {

	public static final DecimalFormat formato = new DecimalFormat("0.00");
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
