/**
 * 
 */
package entities;

/**
 * @author João Victor Almeida Arantes
 *
 */
public class Retangulo {
	public double base;
	public double altura;
	
	public double area() {
				
		return  base * altura;
	}
	
	public double perimetro() {
			
		return 2 *(base + altura);
	}
	
	public double diagonal() {
		double diagonal;
		
		diagonal = Math.sqrt(altura * altura + base * base); 
		
		return diagonal;
	}	
}
