package ar.edu.unju.fi.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioComida;

/**
 * Pruebas unitarias de la Clase Servicio Comida
 * 
 * @version 1.0
 * @since 27/11/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

public class ServicioComidadTest {
    ServicioComida servicioComida;

    /**
     * Metodo para inicializar los objetos antes de probar cada prueba unitaria
     * 
     * @version 1.0
     * @since 27/11/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @BeforeEach
    public void setUp() throws Exception {
        servicioComida = new ServicioComida(30, 800.00, "Parrillada Suiza", 30, 200.00, "Helado");
    }

    /**
     * Metodo vuelve a null objeto despues de realizar prueba
     * 
     * @version 1.0
     * @since 27/11/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @AfterEach
    public void tearDown() throws Exception {
        servicioComida = null;
    }

    /**
     * Metodo para probar y calcular el monto total del Servicio Comida
     * 
     * @version 1.0
     * @since 27/11/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @Test
    public void testServicioComida() {
        assertEquals(30000.00, servicioComida.getCalcularMontoTotal());
    }
}
