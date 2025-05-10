package modelo;

import java.util.List;
import javax.management.ObjectName;
import javax.management.relation.Role;

public class RoboEnCasa extends Role {

    public RoboEnCasa(String ubicacion, List<ObjectName> nivelGravedad) {
        super(ubicacion, nivelGravedad);
    }

    public void manejarEmergencia() {
        // Aquí implementas la lógica específica para manejar un robo en casa
        System.out.println("Atendiendo robo en casa en " + getUbicacion() + " con nivel de gravedad: " + getNivelGravedad());
    }

    private String getNivelGravedad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNivelGravedad'");
    }

    private String getUbicacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUbicacion'");
    }
}
