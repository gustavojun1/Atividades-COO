// Quadrado é uma subclasse de Retangulo
public class Quadrado extends Retangulo {
	
	// construtor
	Quadrado(double l) {
		// um quadrado é um retangulo de lados iguais 
		super(l, l);
	}

	@Override
	public String toString() {
		return "lado = " + get_a();
	}
	
}
