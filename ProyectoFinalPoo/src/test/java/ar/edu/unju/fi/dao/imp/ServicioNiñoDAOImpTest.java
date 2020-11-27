package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IServicioNiñosDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioNiños;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Servicio de Niños para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ServicioNiñoDAOImpTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un Servicio de Niños a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarServicioNiñoTest() {

        IServicioNiñosDAO servicioNiño = new ServicioNiñoDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        ServicioNiños sn = new ServicioNiños(1, 7500.00, "Cantidad Niños y Precio plata por niño", 30, 500.00);
        servicioNiño.save(sn);
        assertEquals(7500.00, manager.find(ServicioNiños.class, 1).getPrecio());

    }
}
