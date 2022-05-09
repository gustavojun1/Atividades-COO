// Retangulo é uma subclasse de Paralelogramo
public class Retangulo extends Paralelogramo {
	
	// construtor
	Retangulo(double a, double h) {
		// um retângulo é um paralelogramo cujo ângulo é 90°
		super(a, h, Math.PI / 2);
	}
	
	@Override
	public String toString() {
		return "lado 1 = " + get_a() + "; lado 2 = " + get_h();
	}
	
}
