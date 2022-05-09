
public class TesteCarbono {
	
	public static void main(String[] args) {
		Casa minhaMansao = new Casa(200, 400);
		Carro minhaFerrari = new Carro("motor Ferrari", 'e', 5.1, 20);
		Bicicleta minhaBMX = new Bicicleta(true);
		
		EmissorCarbono[] array = {minhaMansao, minhaFerrari, minhaBMX};
		
		for(EmissorCarbono i : array) {
			System.out.println(i);
			System.out.println(i.getCarbonoEmitido());
		}
	}
	
}
