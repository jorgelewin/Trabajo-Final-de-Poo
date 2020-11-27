package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.jupiter.api.Test;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Gestor de Eventos para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class GestorEventoTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se muestra un evento 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void mostrarEventoTest() {
        /*
         * try {
         * 
         * emf = Persistence.createEntityManagerFactory("persistencia"); manager =
         * emf.createEntityManager(); List<EventoSocial> eventos =
         * manager.createQuery("From EventoSocial").getResultList();
         * System.out.println("En esta base de datos hay " + eventos.size() +
         * " eventos"); assertNotNull(eventos); //
         * assertNotNull(GestorEvento.getMostrarEventos(new Date(120, 10, 24), new //
         * Date(120, 11, 26)));
         * 
         * } catch (Exception e) { System.out.println(e.toString()); }
         */
    }

}
