package classes;

public class AreaCirc {
	double raio;
	// static define que essa variavel ou metodo ser� igual para todos as instancias
	// o final ir� tornar a varivel uma constante 
	static final double pi=3.14;
	
	AreaCirc(double raioInicial){
		raio=raioInicial;
	}
	
	double area() {
		return pi*Math.pow(raio, 2);
	}

}
