package vista;

import java.util.ArrayList;
import java.util.List;

public class ContenedorProvinciasEtiquetas {

	List <EtiquetasProvincias> contenedor;
	
	public ContenedorProvinciasEtiquetas() {
		contenedor = new ArrayList<EtiquetasProvincias>();
	}

	public List<EtiquetasProvincias> getListas() {
		return contenedor;
	}

	public void setListas(List<EtiquetasProvincias> etiquetas) {
		this.contenedor = etiquetas;
	}
	
}
