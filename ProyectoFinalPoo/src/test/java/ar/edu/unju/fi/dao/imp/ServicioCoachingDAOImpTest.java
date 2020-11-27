package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IServicioCoachingDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioCoaching;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Servicio de Coaching para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioCoachingDAOImpTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un Servicio de Coaching a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarServicioCoachingTest() {
        IServicioCoachingDAO servicio = new ServicioCoachingDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        ServicioCoaching unServicio = new ServicioCoaching(1, 20000.00, "ServicioCoaching", 20, 1000.00);
        servicio.saver(unServicio);

        assertEquals(20000.00, manager.find(ServicioCoaching.class, 1).getPrecio());

    }
}
