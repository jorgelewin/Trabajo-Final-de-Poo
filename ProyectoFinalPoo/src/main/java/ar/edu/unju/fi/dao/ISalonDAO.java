package ar.edu.unju.fi.dao;

import ar.edu.unju.fi.modelo.dominio.aplicacion.Salon;

/**
 * Interfaz de la Entidad Salon para definir la nomenclatura de los metodos que
 * persistiran la entidad
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public interface ISalonDAO {

    /**
     * Nomenclatura definida del metodo save que persistira un Salon en la Base de
     * Datos
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void save(Salon salon);

}
