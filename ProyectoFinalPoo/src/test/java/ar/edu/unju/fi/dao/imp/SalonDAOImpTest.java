package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.ISalonDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Salon;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Salon para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class SalonDAOImpTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un salon a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarSalon() {

        ISalonDAO salonDAO = new SalonDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();

        Salon salon1 = new Salon(1, "Momento Unicos", "Otero N° 220", 50, 20000.00);
        // Salon salon2 = new Salon(2, "Momento Feliz", "Lavalle N° 357", 70, 30000.00);

        salonDAO.save(salon1);
        // salonDAO.save(salon2);

        String nombre = manager.find(Salon.class, 1).getNombre();
        assertEquals("Momento Unicos", nombre, "No es el nombre local");
    }

}
