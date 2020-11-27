package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.IServicioCoachingDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioCoaching;

/**
 *  Clase que implementa la interfaz de Servicio de Coaching para implementar los metodos definidos anteriormente.
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioCoachingDAOImp implements IServicioCoachingDAO {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo implementado que persiste un Servicio de Coaching en la Base de Datos
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public void saver(ServicioCoaching servicioCoaching) {
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(servicioCoaching);
        manager.getTransaction().commit();

    }

}
