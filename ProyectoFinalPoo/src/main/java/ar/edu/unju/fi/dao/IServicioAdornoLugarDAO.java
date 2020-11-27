package ar.edu.unju.fi.dao;

import ar.edu.unju.fi.modelo.dominio.aplicacion.ServicioAdornoLugar;

/**
 * Interfaz de la Entidad Servicio de Adorno del Lugar para definir la
 * nomenclatura de los metodos que persistiran la entidad
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public interface IServicioAdornoLugarDAO {

    /**
     * Nomenclatura definida del metodo save que persistira un Servicio de Adorno
     * del Lugar en la Base de Datos
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void save(ServicioAdornoLugar servicioAdornoLugar);
}
