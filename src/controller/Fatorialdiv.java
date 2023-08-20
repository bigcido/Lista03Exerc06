package controller;

public class Fatorialdiv {

	public Fatorialdiv() {
		super();
	}
	
	public double fatorial (double n1) {
	/*Quando a posição do fatorial for 0, retorna um, senão multiplica F(n) onde "n" é o 
	 *nr pedido pro usuário por n-1, até que o valor seja 1
	 */
		if (n1 == 1) {
			return 1;
		} else {
			return  n1 * fatorial(n1-1);
		}
	}
	
	
	public double fatdiv(double ft) {
		double fat = fatorial(ft);
		if (ft == 1) {
			return 1;
		} else {
			return (1/fatorial(ft)+ fatdiv(ft-1));
		}
}/* Do mesmo jeito que a primeira função determina o fatorial, a segunda função determina a
/ soma de todos os fatoriais, partindo do 1/n ("n" é o termo solicitado pelo usuario), até o "1",
 * que é o termo imutável.
*/
}
