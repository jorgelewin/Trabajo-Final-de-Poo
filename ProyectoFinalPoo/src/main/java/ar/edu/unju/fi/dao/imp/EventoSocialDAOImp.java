package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.IEventoSocialDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.EventoSocial;

/**
 * Clase que implementa la interfaz de Evento Social para implementar los
 * metodos definidos anteriormente.
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class EventoSocialDAOImp implements IEventoSocialDAO {

    EntityManager manager;
    EntityManagerFactory emf;

    /**
     * Metodo implementado que persiste un Evento Social en la Base de Datos
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    @Override
    public void save(EventoSocial evento) {
        try {
            emf = Persistence.createEntityManagerFactory("persistencia");
            manager = emf.createEntityManager();
            manager.getTransaction().begin();
            manager.persist(evento);
            manager.getTransaction().commit();
            manager.close();

        } catch (Exception e) {
            System.out.println("ERROR " + e.toString());
        }

    }

}
