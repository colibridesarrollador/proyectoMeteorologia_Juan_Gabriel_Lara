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
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConexionJSON {

    private static final String URL_BASE_API = "http://worldweather.wmo.int/es/json/";
    private static final String EXTENSION_API = "_es.xml";
    private final Map<String, String> mapeoCiudades;

    public ConexionJSON(Properties properties) {
        this.mapeoCiudades = cargarMapeoDesdeProperties(properties);
    }

    private Map<String, String> cargarMapeoDesdeProperties(Properties properties) {
        Map<String, String> mapeo = new HashMap<>();
        for (String nombreCiudad : properties.stringPropertyNames()) {
            String idCiudad = properties.getProperty(nombreCiudad);
            mapeo.put(nombreCiudad, idCiudad);
        }
        return mapeo;
    }

    public void procesarInformacionClimatologica(String nombreCiudad) {
        String idCiudad = mapeoCiudades.get(nombreCiudad);
        if (idCiudad == null) {
            System.out.println("No se encontró el identificador de la ciudad para el nombre proporcionado.");
            return;
        }

        try {
            String urlApi = URL_BASE_API + idCiudad + EXTENSION_API;
            String respuestaJson = descargarJson(urlApi);

            ObjectMapper objectMapper = new ObjectMapper();
          
            JsonNode jsonNode = objectMapper.readTree(respuestaJson);

            // Ejemplo: Mostrar algunos campos específicos del JSON
            String temperatura = jsonNode.path("temperatura").asText();
            String humedad = jsonNode.path("humedad").asText();

            System.out.println("Información climatológica para " + nombreCiudad + " (ID " + idCiudad + "):");
            System.out.println("Temperatura: " + temperatura);
            System.out.println("Humedad: " + humedad);
            // Puedes continuar extrayendo y mostrando otros campos según sea necesario

        } catch (IOException e) {
            System.err.println("Error al procesar la información climatológica: " + e.getMessage());
        }
    }
    public void mostrarTodasLasCiudades() {
        Set<String> nombresCiudades = mapeoCiudades.keySet();
        System.out.println("Lista de ciudades disponibles:");
        for (String nombre : nombresCiudades) {
            System.out.println(nombre);
        }
    }

    public void mostrarInformacionClimatologica(String nombreCiudad) {
        String idCiudad = mapeoCiudades.get(nombreCiudad);
        if (idCiudad == null) {
            System.out.println("No se encontró el identificador de la ciudad para el nombre proporcionado.");
            return;
        }

        try {
            String urlApi = URL_BASE_API + idCiudad + EXTENSION_API;
            String respuestaJson = descargarJson(urlApi);

            System.out.println("Información climatológica para " + nombreCiudad + " (ID " + idCiudad + "):\n" + respuestaJson);
        } catch (IOException e) {
            System.err.println("Error al obtener información climatológica: " + e.getMessage());
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
        try (BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder respuesta = new StringBuilder();
            String linea;

            while ((linea = lector.readLine()) != null) {
                respuesta.append(linea);
            }

            return respuesta.toString();
        }
    }

    public static void main(String[] args) {
        Properties properties = new Properties();
        try (InputStreamReader reader = new InputStreamReader(ConexionJSON.class.getClassLoader().getResourceAsStream("resources/config.properties"), StandardCharsets.UTF_8)) {
            properties.load(reader);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo de propiedades: " + e.getMessage());
            System.exit(1);
        }

        ConexionJSON gestor = new ConexionJSON(properties);

        // Mostrar todas las ciudades disponibles
        //gestor.mostrarTodasLasCiudades();

        // Ejemplo de uso: Obtener información climatológica para una ciudad específica
        gestor.mostrarInformacionClimatologica("Madrid");
        gestor.procesarInformacionClimatologica("Madrid");
    }
}
