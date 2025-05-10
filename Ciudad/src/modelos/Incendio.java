package modelos;  // O 'modelo', según tu carpeta

public class Incendio extends Emergencia {  

    public Incendio(String ubicacion, int nivelGravedad) {  
        super("Incendio", ubicacion, nivelGravedad);  
    }  
    
    public Incendio(String descripcion, String ubicacion) {
        //TODO Auto-generated constructor stub
    }

    public Incendio(String descripcion, String ubicacion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void manejarEmergencia() {  
        System.out.println("Atendiendo incendio en " + getUbicacion() + " con nivel de gravedad: " + getNivelGravedad());
    }  

    @SuppressWarnings("override")
    public String getUbicacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUbicacion'");
    }

    @Override
    public int getNivelGravedad() {
        return super.getNivelGravedad();  // Devuelve el nivel de gravedad desde la clase base
    }

    // No es necesario sobreescribir getUbicacion() ya que lo heredas de Emergencia
}
