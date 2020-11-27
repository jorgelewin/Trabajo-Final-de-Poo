package ar.edu.unju.fi.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.modelo.dominio.aplicacion.Cliente;
import ar.edu.unju.fi.modelo.dominio.aplicacion.EventoSocial;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Salon;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Servicio;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioComida;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioMusica;

/**
 * Pruebas unitarias de la Clase Evento Social
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

public class EventoSocialTest {

   EventoSocial eventoSocial;
   Servicio servicioComida, servicioMusica;
   Salon salon;

   /**
    * Metodo para inicializar los objetos antes de probar cada prueba unitaria
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    *
    */

   @BeforeEach
   public void setUp() throws Exception {
      eventoSocial = new EventoSocial(1, "16:30", "22:00", false, 10000.00, new Date(),
            "Quedaron de acuerdo con el salon", 27000.00,
            new Cliente(1, "Dario", "Sosa", "Pacara y Rinconada 570", "4248239"));
      servicioComida = new ServicioComida(20, 500.00, "Lomito Champinong", 20, 100.00, "Torta");
      servicioMusica = new ServicioMusica(5, 1000.00);
      salon = new Salon(1, "Salon 1", "Carrasco 540", 40, 10000.00);
      eventoSocial.agregarServicio(servicioComida);
      eventoSocial.agregarServicio(servicioMusica);
      eventoSocial.agregarSalon(salon);
   }

   /**
    * Metodo para poner los objetos en nulo despues de probar cada prueba unitaria
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    *
    */

   @AfterEach
   public void tearDown() throws Exception {
      eventoSocial = null;
      servicioComida = null;
      servicioMusica = null;
      salon = null;

   }

   /**
    * Metodo para probar si se inicializo el objeto de evento Social
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    *
    */

   @Test
   public void inicializarEventoSocial() {
      assertNotNull(eventoSocial);
   }

   /**
    * Metodo para probar si se agrega un servicio a la lista del evento Social
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    *
    */

   @Test
   public void verificarServicioEnEvento() {

      assertEquals(2, eventoSocial.getServicios().size());

   }

   /**
    * Metodo para probar si se agrega un salon a la lista del evento Social
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    */

   @Test
   public void verificarSalon() {

      assertEquals(1, eventoSocial.getSalones().size(), "No tiene elemento la lista");

   }

   /**
    * Metodo para probar si se elimina un servicio de la lista del evento Social
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    *
    */

   @Test
   public void montoTotalDelEvento() {

      assertEquals(27000.00, eventoSocial.calcularMontoTotalEvento());

   }

   /**
    * Metodo para probar si se elimina un salon de la lista del evento Social
    * 
    * @version 1.0
    * @since 20/10/2020
    * @author Mauro Ayarde - Jorge Lewin
    *
    */

   @Test
   public void registrarSaldo() {

      assertEquals(10000.00, eventoSocial.getAdelanto());
      eventoSocial.registrarAdelantoSaldo(5000.00);
      assertEquals(15000.00, eventoSocial.getAdelanto());

   }

}
