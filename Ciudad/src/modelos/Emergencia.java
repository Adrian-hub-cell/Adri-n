// Emergencia.java

package modelos;


public class Emergencia {
    private final String tipo;
    private final String descripcion;

    public Emergencia(String tipo, String descripcion, int nivelGravedad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Emergencia [tipo=" + tipo + ", descripcion=" + descripcion + "]";
    }

    public int getNivelGravedad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNivelGravedad'");
    }

    String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    String getDescripcion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
