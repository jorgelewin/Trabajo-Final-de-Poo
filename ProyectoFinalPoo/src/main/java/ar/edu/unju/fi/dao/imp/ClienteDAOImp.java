package ar.edu.unju.fi.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.IClienteDAO;
import ar.edu.unju.fi.modelo.dominio.aplicacion.Cliente;

/**
 * Clase que implementa la interfaz de Cliente para implementar los metodos
 * definidos anteriormente.
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class ClienteDAOImp implements IClienteDAO {

    private EntityManager manager;
    private EntityManagerFactory emf;

    /**
     * Metodo implementado que persiste un cliente en la Base de Datos
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    @Override
    public void save(Cliente cliente) {
        // Aqui vamos a escribir el código para realizar el acceso a la base de datos
        // y persistir el objeto
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }

    // @Override
    // public void delete(Cliente cliente) {
    /*
     * emf = Persistence.createEntityManagerFactory("persistencia"); manager =
     * emf.createEntityManager(); try { Cliente clienteEncontrado =
     * manager.find(Cliente.class, cliente.getId());
     * manager.getTransaction().begin(); manager.remove(clienteEncontrado);
     * manager.getTransaction().commit(); } catch (Exception e) { manager.close(); }
     * 
     * }
     * 
     * @Override public void update(Cliente cliente) { emf =
     * Persistence.createEntityManagerFactory("persistencia"); manager =
     * emf.createEntityManager(); try { // Cliente clienteEncontrado =
     * manager.find(Cliente.class, cliente.getId());
     * manager.getTransaction().begin(); cliente.setId(3); manager.merge(cliente);
     * manager.getTransaction().commit(); } catch (Exception e) { manager.close(); }
     * 
     * }
     */

}
