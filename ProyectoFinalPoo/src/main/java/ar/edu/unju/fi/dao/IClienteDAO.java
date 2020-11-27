package ar.edu.unju.fi.dao;

import ar.edu.unju.fi.modelo.dominio.aplicacion.Cliente;

/**
 * Interfaz de la Entidad Cliente para definir la nomenclatura de los metodos
 * que persistiran la entidad
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public interface IClienteDAO {

    /**
     * Nomenclatura definida del metodo save que persistira un cliente en la Base de
     * Datos
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void save(Cliente cliente);

    // public void delete(Cliente cliente);

    // public void update(Cliente cliente);

}
