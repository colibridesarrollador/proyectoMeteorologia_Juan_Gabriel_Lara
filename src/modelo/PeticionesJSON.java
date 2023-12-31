
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PeticionesJSON {

	private static final String URL_BASE_API = "http://worldweather.wmo.int/es/json/";
	private static final String EXTENSION_API = "_es.xml";
	private final Map<String, String> mapeoCiudades;
	private Properties properties;
	
	
	

	public PeticionesJSON() {
		this.LeerProperties();
		this.mapeoCiudades = cargarMapeoDesdeProperties();
	}
	// Método para leer el archivo properties
	private void LeerProperties() {
		this.properties = new Properties();
		try (InputStreamReader reader = new InputStreamReader(PeticionesJSON.class.getClassLoader().getResourceAsStream("resources/config.properties"),StandardCharsets.UTF_8)) {
			properties.load(reader);
		} catch (IOException e) {
			System.err.println("Error al cargar el archivo de propiedades: " + e.getMessage());
		}
	}
	
	// Método para almacenar el mapeo desde el archivo de propiedades
	private Map<String, String> cargarMapeoDesdeProperties() {
		Map<String, String> mapeo = new HashMap<>();
		for (String nombreCiudad : properties.stringPropertyNames()) {
			String idCiudad = properties.getProperty(nombreCiudad);
			mapeo.put(nombreCiudad, idCiudad);
		}
		return mapeo;
	}

	// Método principal para hacer la petición al servidor y procesar la respuesta JSON
	public DiaPronostico hacerPeticion(String nombreCiudad,int dia)  {

		DiaPronostico diaPronosticado = new DiaPronostico();
		
		String idCiudad = mapeoCiudades.get(nombreCiudad);

		if (idCiudad == null) {
			System.out.println("No se encontró el identificador de la ciudad para el nombre proporcionado: "+nombreCiudad);
			return null;
		}

		try {
			String urlApi = URL_BASE_API + idCiudad + EXTENSION_API;
			String respuestaJson = descargarJson(urlApi);

			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(respuestaJson);

			// Obtener información de la ciudad
			String ciudad = jsonNode.path("city").path("cityName").asText();
			System.out.println("Procesando "+ciudad+"....");
			
			// Obtener el nodo "forecastDay" que contiene el pronóstico para varios días
			JsonNode forecastDays = jsonNode.path("city").path("forecast").path("forecastDay");
			
			
				//recoge el día iésiomo del JSON
				JsonNode diaPronostico = forecastDays.get(dia);
				
				diaPronosticado.setEstadoClima(diaPronostico.path("weather").asText());
				diaPronosticado.setTempMinima(diaPronostico.path("minTemp").asText());
				diaPronosticado.setTempMaxima(diaPronostico.path("maxTemp").asText());
	
		
			return diaPronosticado;
		} catch (Exception e) {
			System.err.println("Problemas en el método procesarDatos de la clase PeticionesJSON");
			return null;
		}
	}
	// Método para descargar el JSON desde la URL proporcionada
	private String descargarJson(String urlApi) throws IOException {
		URL url = new URL(urlApi);
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");

		
		// Seguir redirecciones con un límite
		// Inicializamos un contador para el número de redirecciones
		int contadorRedirecciones = 0;

	
		// Mientras el código de respuesta indique una redirección (código en el rango 300-399)
		// y no hayamos alcanzado el límite de redirecciones (5 en este caso)
		while (conexion.getResponseCode() / 100 == 3 && contadorRedirecciones < 5) {
		    // Obtenemos la nueva URL a la que se está redirigiendo
		    String nuevaUrl = conexion.getHeaderField("Location");
		    	
		    // Abrimos una nueva conexión a la URL redirigida
		    conexion = (HttpURLConnection) new URL(nuevaUrl).openConnection();

		    // Incrementamos el contador de redirecciones
		    contadorRedirecciones++;
		}
		
		// Leer la respuesta
		try (BufferedReader lector = new BufferedReader(
				new InputStreamReader(conexion.getInputStream(), StandardCharsets.UTF_8))) {
			StringBuilder respuesta = new StringBuilder();
			String linea;

			while ((linea = lector.readLine()) != null) {
				respuesta.append(linea);
			}

			return respuesta.toString();
		}
	}

}
