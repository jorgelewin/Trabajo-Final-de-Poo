package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.IServicioDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Servicio;

/**
 *  Clase que implementa la interfaz de Servicio para implementar los metodos definidos anteriormente.
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioDAOImp implements IServicioDAO {

    EntityManager manager;
    EntityManagerFactory emf;

    /*
     * @Override public void save(Servicio servicio) {
     * 
     * emf = Persistence.createEntityManagerFactory("persistencia"); manager =
     * emf.createEntityManager(); manager.getTransaction().begin();
     * manager.persist(servicio); manager.getTransaction().commit();
     * 
     * }
     */

     /**
 *  Metodo implementado que persiste un Servicio en la Base de Datos
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public void save(Servicio servicio) {

        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(servicio);
        manager.getTransaction().commit();
    }

}
