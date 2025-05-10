package main;

import modelo.Emergencia;
import patrones.EstrategiaAsignacion;

@SuppressWarnings("unused")
public class ConfiguracionSistema {

    public static EstrategiaAsignacion obtenerEstrategiaAsignacion() {
        // Acá podés cambiar por otra estrategia si querés: AsignacionPorProximidad, etc.
        return new AsignacionPorPrioridad();
    }

    private static class AsignacionPorPrioridad implements EstrategiaAsignacion {

        public AsignacionPorPrioridad() {
        }

        @Override
        public void asignarRecursos(Emergencia emergencia) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'asignarRecursos'");
        }
    }
}
