package modelo;

import java.util.List;

public class Pronostico {

	private List <DiaPronostico> dias;

	public Pronostico(List<DiaPronostico> dias) {
		this.dias = dias;
	}

	public List<DiaPronostico> getDias() {
		return dias;
	}

	public void setDias(List<DiaPronostico> dias) {
		this.dias = dias;
	}
	
}
