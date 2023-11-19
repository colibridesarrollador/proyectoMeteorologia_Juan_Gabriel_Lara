
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
	private DiaPronostico dia;
	private Pronostico dias;

	public PeticionesJSON() {
		this.LeerProperties();
		this.mapeoCiudades = cargarMapeoDesdeProperties();
	}

	private void LeerProperties() {
		this.properties = new Properties();
		try (InputStreamReader reader = new InputStreamReader(PeticionesJSON.class.getClassLoader().getResourceAsStream("resources/config.properties"),StandardCharsets.UTF_8)) {
			properties.load(reader);
		} catch (IOException e) {
			System.err.println("Error al cargar el archivo de propiedades: " + e.getMessage());
			System.exit(1);
		}
	}
	

	private Map<String, String> cargarMapeoDesdeProperties() {
		Map<String, String> mapeo = new HashMap<>();
		for (String nombreCiudad : properties.stringPropertyNames()) {
			String idCiudad = properties.getProperty(nombreCiudad);
			mapeo.put(nombreCiudad, idCiudad);
		}
		return mapeo;
	}

	public Pronostico hacerPeticion(String nombreCiudad)  {

		DiaPronostico dia = new DiaPronostico();
		Pronostico pronostico = new Pronostico();

		String idCiudad = mapeoCiudades.get(nombreCiudad);

		if (idCiudad == null) {
			//System.out.println("No se encontró el identificador de la ciudad para el nombre proporcionado: "+nombreCiudad);
			return null;
		}

		try {
			String urlApi = URL_BASE_API + idCiudad + EXTENSION_API;
			String respuestaJson = descargarJson(urlApi);

			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonNode = objectMapper.readTree(respuestaJson);

			// Obtener información de la ciudad
			String ciudad = jsonNode.path("city").path("cityName").asText();
			pronostico.setNombreCiudad(ciudad);
			System.out.println("Procesando "+ciudad+"....");
			// Obtener el nodo "forecastDay" que contiene el pronóstico para varios días
			JsonNode forecastDays = jsonNode.path("city").path("forecast").path("forecastDay");

			// Iterar sobre los próximos 4 días
			
			for(int i = 0; i < 4; i++) {
				
				JsonNode diaPronostico = forecastDays.get(i);
				//System.out.println(nombreCiudad);
				
					dia.setFechaPronostico(diaPronostico.path("forecastDate").asText());

					dia.setEstadoClima(diaPronostico.path("weather").asText());

					dia.setTempMinima(diaPronostico.path("minTemp").asText());

					dia.setTempMaxima(diaPronostico.path("maxTemp").asText());

					pronostico.getDias().add(dia);
					
					
				}
				/*
				System.out.println("Fecha: " + dia.getFechaPronostico());
				System.out.println("Condicion climatologica: " + dia.getEstadoClima());
				System.out.println("Temperatura Mínima: " + dia.getTempMinima());
				System.out.println("Temperatura Máxima: " + dia.getTempMaxima());
				*/
		
			return pronostico;
		} catch (Exception e) {
			System.err.println("Problemas en el método procesarDatos de la clase PeticionesJSON");
			return null;
		}
	}

	private String descargarJson(String urlApi) throws IOException {
		URL url = new URL(urlApi);
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");

		// Seguir redirecciones con un límite
		int contadorRedirecciones = 0;
		while (conexion.getResponseCode() / 100 == 3 && contadorRedirecciones < 5) {
			String nuevaUrl = conexion.getHeaderField("Location");
			conexion = (HttpURLConnection) new URL(nuevaUrl).openConnection();
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
