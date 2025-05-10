package patrones;
public interface Emergenciafactory {
    void mostrarInfo();
}
public class Incendio implements Emergencia {
    @Override
    public void mostrarInfo() {
        System.out.println("Emergencia: Incendio");
    }
}

public class Accidente implements Emergencia {
    @Override
    public void mostrarInfo() {
        System.out.println("Emergencia: Accidente");
    }
}

public class Inundacion implements Emergencia {
    @Override
    public void mostrarInfo() {
        System.out.println("Emergencia: Inundación");
    }
}
public class EmergenciaFactory {
    public static Emergencia crearEmergencia(String tipo) {
        switch (tipo.toLowerCase()) {
            case "incendio":
                return new Incendio();
            case "accidente":
                return new Accidente();
            case "inundacion":
                return new Inundacion();
            default:
                throw new IllegalArgumentException("Tipo de emergencia no reconocido: " + tipo);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Emergencia e1 = EmergenciaFactory.crearEmergencia("incendio");
        Emergencia e2 = EmergenciaFactory.crearEmergencia("accidente");

        e1.mostrarInfo();  // Salida: Emergencia: Incendio
        e2.mostrarInfo();  // Salida: Emergencia: Accidente
    }
}
