package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IServicioComidaDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioComida;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Servicio de Comida para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioComidaDAOImpTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un Servicio de Comida a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarServicioMusicaTest() {
        IServicioComidaDAO servicio = new ServicioComidaDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        ServicioComida unServicio = new ServicioComida(1, 45000.00, "Plato Principal y Postre", 30, 1000.00,
                "Parrillada", 30, 500.00, "Helado");
        servicio.save(unServicio);

        assertEquals(45000.00, manager.find(ServicioComida.class, 1).getPrecio());

    }
}
