package classes;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		//atribui��o por valor
		//b recebe uma copia do valor de a
		double a = 2;
		double b = a;
		
		//Atribui��o por referencia
		//d1 aponta para um objeto atraves de um edere�o 
		//ele ir� passar seu endere�o para d2, assim os dois ir�o apontar para o mesmo objeto
		
		Data d1 = new Data(14,5,1996);
		Data d2 = d1;
		
		System.out.println(d1.ObterData());
		
	}
}
