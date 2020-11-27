package ar.edu.unju.fi.dao.imp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IEventoSocialDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Cliente;
import ar.edu.unju.fi.modelo.dominio.aplicacion.EventoSocial;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Salon;

import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioMusica;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Evento Social para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class EventoSocialDAOImpTest {

    EntityManager manager;
    EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un Evento Social a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarEventoSocialTest() {

        try {
            emf = Persistence.createEntityManagerFactory("persistencia");
            manager = emf.createEntityManager();
            IEventoSocialDAO eventoDAO = new EventoSocialDAOImp();

            EventoSocial unEvento = new EventoSocial(1, "17:00pm", "21:00pm", false, 80000.00, new Date(),
                    "Se realiza en el salon 1", 20000.00,
                    new Cliente(2, "Leandro", "Ayala", "Barbessini 333", "3888425566"));

            Salon salon1 = new Salon(1, "Momento Unicos", "Otero N° 220", 50, 20000.00);
            ServicioMusica unServicioM = new ServicioMusica(1, 30000.00, "ServicioMusica", 10, 3000.00);

            unEvento.getSalones().add(salon1);
            unEvento.getServicios().add(unServicioM);

            eventoDAO.save(unEvento);
            assertEquals(1, ((EventoSocial) manager.find(EventoSocial.class, 1)).getId());

        } catch (Exception e) {
            System.out.println("ERROR" + e.toString());
        }

    }

}
