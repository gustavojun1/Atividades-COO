
public class Carro implements EmissorCarbono{
	
	// atributos exclusivos
	final int rodas = 4;
	String motor;
	
	char combustivel;
	// Gasolina -> 'g'
	// Etanol -> 'e'
	// Diesel -> 'd'
	double autonomia; // km/L
	double distancia_percorrida; // km
	
	Carro(String motor, char combustivel, double autonomia, double distancia_percorrida) {
		this.motor = motor;
		this.combustivel = combustivel;
		this.autonomia = autonomia;
		this.distancia_percorrida = distancia_percorrida;
	}
	
	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public char getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(char combustivel) {
		this.combustivel = combustivel;
	}

	public double getAutonomia() {
		return autonomia;
	}
	
	public double getDistancia_percorrida() {
		return distancia_percorrida;
	}

	public void setDistancia_percorrida(double distancia_percorrida) {
		this.distancia_percorrida = distancia_percorrida;
	}

	public int getRodas() {
		return rodas;
	}

	@Override
	public double getCarbonoEmitido() {
		double emissao = 0;
		switch(combustivel) {
			case 'g':
				emissao = 2.2755;
			case 'e':
				emissao = 1.722;
			case 'd':
				emissao = 2.6;
			// em kg de CO_2 / L
		}
		
		return distancia_percorrida / autonomia * emissao;
	}

	@Override
	public String toString() {
		return "Carro [rodas=" + rodas + ", motor=" + motor + ", combustivel=" + combustivel + ", autonomia="
				+ autonomia + ", distancia_percorrida=" + distancia_percorrida + "]";
	}	
	
}
