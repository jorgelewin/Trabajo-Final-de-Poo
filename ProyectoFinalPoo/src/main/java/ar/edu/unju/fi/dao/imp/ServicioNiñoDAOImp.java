package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.IServicioNiñosDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioNiños;

/**
 *  Clase que implementa la interfaz de Servicio de Niños para implementar los metodos definidos anteriormente.
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioNiñoDAOImp implements IServicioNiñosDAO {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo implementado que persiste un Servicio de Niños en la Base de Datos
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public void save(ServicioNiños servicioNiño) {
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(servicioNiño);
        manager.getTransaction().commit();

    }

}
