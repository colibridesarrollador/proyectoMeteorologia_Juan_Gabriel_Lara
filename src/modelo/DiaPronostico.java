package modelo;

public class DiaPronostico {

   
    private String fechaPronostico;
    private String estadoClima;
    private String tempMinima;
    private String tempMaxima;

    
    
    public DiaPronostico(String fechaPronostico, String estadoClima, String tempMinima, String tempMaxima) {
		this.fechaPronostico = fechaPronostico;
		this.estadoClima = estadoClima;
		this.tempMinima = tempMinima;
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