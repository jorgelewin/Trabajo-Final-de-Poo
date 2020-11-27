package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IServicioDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Servicio;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioNiños;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Servicio para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioDAOImpTest {
    EntityManager manager;
    EntityManagerFactory emf;

    /*
     * @Test public void agregarServicioTest() { IServicioDAO servicio = new
     * ServicioDAOImp(); emf =
     * Persistence.createEntityManagerFactory("persistencia"); manager =
     * emf.createEntityManager(); Servicio unServicio = new
     * Servicio(8,12000.00,"servicio");
     * 
     * servicio.save(unServicio); assertEquals(30000.00,
     * manager.find(Servicio.class, 1).getPrecio());
     * 
     * }
     */

/**
 *  Metodo para probar que se agrega un Servicio a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarServicioNiñoTest() {

        IServicioDAO servicio = new ServicioDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        Servicio sn = new ServicioNiños(1, 7500.00, "Cantidad Niños y Precio plata por niño", 30, 500.00);
        servicio.save(sn);
        assertEquals(7500.00, manager.find(ServicioNiños.class, 1).getPrecio());

    }

}
