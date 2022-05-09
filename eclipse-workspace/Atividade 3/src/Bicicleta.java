
public class Bicicleta implements EmissorCarbono {
	// atributos exclusivos
	final int rodas = 2;
	boolean sininho;
	
	Bicicleta(boolean sininho) {
		this.sininho = sininho;	
	}
	
	public int getRodas() {
		return rodas;
	}

	public void setSininho(boolean sininho) {
		this.sininho = sininho;
	}

	@Override
	public double getCarbonoEmitido() {
		// #TeamBikes uhul
		return 0;
	}
	
	public boolean getSininho() {
		return sininho;
	}
	
	public int getNumRodas() {
		return rodas;
	}

	@Override
	public String toString() {
		return "Bicicleta [rodas=" + rodas + ", sininho=" + sininho + "]";
	}
	
}
