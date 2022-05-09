
public class TestaFormas {
	public static void main(String[] args) {
//		(a) (0,5 ponto) Criar um objeto Paralelogramo, um Retângulo e um Quadrado e criar um vetor com esses objetos.
		Paralelogramo p = new Paralelogramo(4, 1, 0.785);
		Paralelogramo r = new Retangulo(3, 2);
		Paralelogramo q = new Quadrado(1);
		// declarar todos os objetos como Paralelogramo (classe superior) para facilitar a declaração do vetor (boa prática)
		Paralelogramo[] vetor = {p, r, q};
		
//		(b) (0,5 ponto) Chamar o método toString e o método getAngulo de cada um dos elementos do vetor.
//		(c) (0,5 ponto) Calcular e exibir a área de cada um dos elementos do vetor.
//		(d) (0,5 ponto) Calcular e exibir o perímetro de cada um dos elementos do vetor.
		
		System.out.println(vetor[0]);
		System.out.println("angulo = " + vetor[0].getAngulo());
		System.out.println("área = " + vetor[0].calcularArea());
		System.out.println("perimetro = " + vetor[0].calcularPerimetro());
		
		System.out.println();
		
		System.out.println(vetor[1]);
		System.out.println("angulo = " + vetor[1].getAngulo());
		System.out.println("área = " + vetor[1].calcularArea());
		System.out.println("perimetro = " + vetor[1].calcularPerimetro());
		
		System.out.println();
		
		System.out.println(vetor[2]);
		System.out.println("angulo = " + vetor[2].getAngulo());
		System.out.println("área = " + vetor[2].calcularArea());
		System.out.println("perimetro = " + vetor[2].calcularPerimetro());
	
	}
	
}