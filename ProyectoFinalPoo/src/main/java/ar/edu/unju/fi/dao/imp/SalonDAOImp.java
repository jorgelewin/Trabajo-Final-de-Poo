package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.ISalonDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Salon;

/**
 *  Clase que implementa la interfaz de Salon para implementar los metodos definidos anteriormente.
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class SalonDAOImp implements ISalonDAO {

    private EntityManager manager;
    private EntityManagerFactory emf;

/**
 *  Metodo implementado que persiste un Salon en la Base de Datos
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public void save(Salon salon) {

        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(salon);
        manager.getTransaction().commit();

    }

}
