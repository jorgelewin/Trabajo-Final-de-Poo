package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.IClienteDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Cliente;

/**
 *  Pruebas Unitarias de la implementacion del DAO de Clientes para persistir el objeto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ClienteDAOImpTest {

    public static EntityManager manager;
    public static EntityManagerFactory emf;

/**
 *  Metodo para probar que se agrega un cliente a la base de datos 
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Test
    public void agregarClienteTest() {
        // init
        IClienteDAO clienteDAO = new ClienteDAOImp();
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        // define values
        // Cliente cliente1 = new Cliente(1, "Mariano", "Perez", "Av. Mateo 786",
        // "3888425436");
        Cliente cliente2 = new Cliente(2, "Leandro", "Ayala", "Barbessini 333", "3888425566");
        // Cliente cliente3 = new Cliente(3, "Pedro", "Miranda", "Pacara 1023",
        // "3888422226");
        clienteDAO.save(cliente2);
        // clienteDAO.save(cliente2);
        // clienteDAO.save(cliente3);
        // String apellido = manager.find(Cliente.class, 1).getApellido();
        // assertEquals("Perez", apellido, "No es el apellido");

        // eliminacion
        // Cliente a = manager.find(Cliente.class, 33);
        // clienteDAO.delete(manager.find(Cliente.class, 1));
        // assertNull(a);
        // assertEquals(null, manager.find(Cliente.class, 1));
        // modificacion

        // Cliente buscar = manager.find(Cliente.class, 1);
        // clienteDAO.update(buscar);
        // assertEquals(3, buscar.getId());

    }

}
