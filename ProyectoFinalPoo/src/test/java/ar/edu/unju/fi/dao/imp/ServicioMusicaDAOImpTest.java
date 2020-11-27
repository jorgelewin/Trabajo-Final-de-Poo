package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IServicioMusicaDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioMusica;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Servicio de Musica para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioMusicaDAOImpTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un Servicio de Musica a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarServicioMusicaTest() {
        IServicioMusicaDAO servicioMusica = new ServicioMusicaDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        ServicioMusica unServicio = new ServicioMusica(1, 30000.00, "ServicioMusica", 10, 3000.00);
        servicioMusica.save(unServicio);
        assertEquals(30000.00, manager.find(ServicioMusica.class, 1).getPrecio());

    }
}
