package util;  

import java.util.HashMap;  
import java.util.Map;  

public class MapaUrbano {  
    private static final Map<String, Ubicacion> mapa = new HashMap<>();  

    // Método para registrar una ubicación  
    public static void registrarUbicacion(String nombre, int x, int y) {  
        mapa.put(nombre, new Ubicacion(x, y));  
    }  

    // Método para calcular la distancia entre dos ubicaciones  
    public static int calcularDistancia(String origen, String destino) {  
        Ubicacion o = mapa.get(origen);  
        Ubicacion d = mapa.get(destino);  
        return (o != null && d != null)   
            ? Math.abs(o.x - d.x) + Math.abs(o.y - d.y)   
            : Integer.MAX_VALUE;  
    }  

    // Clase interna para representar una ubicación  
    private static class Ubicacion {  
        int x, y;  

        Ubicacion(int x, int y) {  
            this.x = x;  
            this.y = y;  
        }  
    }  
}  