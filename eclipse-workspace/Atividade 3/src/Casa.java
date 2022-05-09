
public class Casa implements EmissorCarbono {
	
	// atributos exclusivos
	int area;
	
	double energia; //energia gasta em kWh
	
	Casa(int area, double energia) {
		this.area = area;
		this.energia = energia;
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	@Override
	public double getCarbonoEmitido() {
		// valor do Reino Unido, fds
		final double emissao = 0.23314; // kg de CO_2 / kWh
		return emissao * energia;		
	}

	@Override
	public String toString() {
		return "Casa [area=" + area + ", energia=" + energia + "]";
	}
		
}
