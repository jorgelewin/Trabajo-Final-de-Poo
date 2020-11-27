package ar.edu.unju.fi.dao;

import ar.edu.unju.fi.modelo.dominio.aplicacion.Servicio;

/**
 * Interfaz de la Entidad Servicio para definir la nomenclatura de los metodos
 * que persistiran la entidad
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public interface IServicioDAO {

    /**
     * Nomenclatura definida del metodo save que persistira un Servicio en la Base
     * de Datos
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void save(Servicio servicio);

}
