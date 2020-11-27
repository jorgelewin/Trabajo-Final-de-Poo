package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IServicioAdornoLugarDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioAdornoLugar;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Servicio de Adornos del Lugar para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioAdornoLugarDAOImpTest {
    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un Servicio de Adorno del Lugar a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarServicioAdornoLugarTest() {
        IServicioAdornoLugarDAO servicio = new ServicioAdornoLugarDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        ServicioAdornoLugar unServicio = new ServicioAdornoLugar(1, 50000.00, "Servicio Adorno Lugar", 5, 10000.00);

        servicio.save(unServicio);
        assertEquals(50000.00, manager.find(ServicioAdornoLugar.class, 1).getPrecio());

    }
}
