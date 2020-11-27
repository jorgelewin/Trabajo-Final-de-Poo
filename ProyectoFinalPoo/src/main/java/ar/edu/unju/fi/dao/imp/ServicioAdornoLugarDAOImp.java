package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.IServicioAdornoLugarDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioAdornoLugar;

/**
 *  Clase que implementa la interfaz de Servicio de Adorno de Lugar para implementar los metodos definidos anteriormente.
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioAdornoLugarDAOImp implements IServicioAdornoLugarDAO {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo implementado que persiste un Servicio de Adorno del Lugar en la Base de Datos
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public void save(ServicioAdornoLugar servicioAdornoLugar) {

        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(servicioAdornoLugar);
        manager.getTransaction().commit();

    }

}
