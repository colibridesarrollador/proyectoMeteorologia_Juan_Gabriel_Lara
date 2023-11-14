package modelo;

public class DiaPronostico {

   
    private String fechaPronostico;
    private String estadoClima;
    private String tempMinima;
    private String tempMaxima;

    
    
	public void setFechaPronostico(String fechaPronostico) {
		this.fechaPronostico = fechaPronostico;
	}

	public void setEstadoClima(String estadoClima) {
		this.estadoClima = estadoClima;
	}

	public void setTempMinima(String tempMinima) {
		this.tempMinima = tempMinima;
	}

	public void setTempMaxima(String tempMaxima) {
		this.tempMaxima = tempMaxima;
	}

	public String getFechaPronostico() {
        return fechaPronostico;
    }

    public String getEstadoClima() {
        return estadoClima;
    }

    public String getTempMinima() {
        return tempMinima;
    }


    public String getTempMaxima() {
        return tempMaxima;
    }
    
}