package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pronostico {

	
	private List <DiaPronostico> dias;

	public Pronostico() {
		this.dias = new ArrayList<>();
	}

	public List<DiaPronostico> getDias() {
		return dias;
	}

	public void setDias(List<DiaPronostico> dias) {
		this.dias = dias;
	}

}
