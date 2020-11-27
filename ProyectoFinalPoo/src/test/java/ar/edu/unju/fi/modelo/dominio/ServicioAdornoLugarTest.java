package ar.edu.unju.fi.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioAdornoLugar;

/**
 * Pruebas unitarias de la Clase Servicio Adorno Lugar
 * 
 * @version 1.0
 * @since 27/11/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

public class ServicioAdornoLugarTest {

    ServicioAdornoLugar servicioAdornoLugar;

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
        servicioAdornoLugar = new ServicioAdornoLugar(20, 500.00);
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
        servicioAdornoLugar = null;
    }

    /**
     * Metodo para probar y calcular el monto total del Servicio Adorno Lugar
     * 
     * @version 1.0
     * @since 27/11/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @Test
    public void testServicioAdornoLugarTest() {

        assertEquals(10000.00, servicioAdornoLugar.getCalcularMontoTotal());

    }
}
