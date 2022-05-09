
public class Paralelogramo {
	private double a;
	private double h;
	private double angulo; // em radianos
	
//	(a) (1,5 ponto) Um construtor que inicializa os atributos supondo que os valores fornecidos são corretos.
	Paralelogramo(double a, double h, double angulo) {
		this.a = a;
		this.h = h;
		this.angulo = angulo;
	}
	
//	(b) (1,0 ponto) Os métodos acessadores (get) necessários.
	public double get_a() {
		return a;
	}
	
	public double get_h() {
		return h;
	}
	
	public double getAngulo() {
		return angulo;
	}
	
//	(c) (1,0 ponto) Um método modificador (set) que modifique os valores de todos os atributos. Suponha que os valores fornecidos são corretos.
	public void setParalelogramo(double a, double h, double angulo) {
		this.a = a;
		this.h = h;
		this.angulo = angulo;
	}
	
//	(d) (1,0 ponto) Um método chamado toString que devolva um string com os valores dos atributos do objeto. 
	@Override
	public String toString() {
		return "a = " + a + "; h = " + h + "; angulo = " + angulo + " radianos"; 
	}
	
	
//	Além disso, a classe Paralelogramo deve ter os métodos a seguir. Esse dois métodos não devem ser sobrescritos pelas classes filhas.

//	(a) (1,0 ponto) Um método chamado calcularArea cujo objetivo é calcular e devolver a área do objeto.
	public double calcularArea() {
		return a * h;
	}
	
//	(b) (1,5 ponto) Um método chamado calcularPerimetro cujo objetivo é calcular e devolver o perímetro do objeto.
	public double calcularPerimetro() {	
		return 2 * (a + h / Math.sin(angulo));
	}
}
