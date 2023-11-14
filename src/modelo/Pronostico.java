package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pronostico {

	private String nombreCiudad;
	private List <DiaPronostico> dias;

	public Pronostico() {
		this.dias = new ArrayList<>();
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public List<DiaPronostico> getDias() {
		return dias;
	}

	public void setDias(List<DiaPronostico> dias) {
		this.dias = dias;
	}

}
