package ar.edu.unju.fi.modelo.dominio.aplicacion;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  Clase que representa a un Servicio de Coaching que hereda de la Clase Servicio
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@DiscriminatorValue("ServicioC")
@Table(name = "ServiciosCoaching")
public class ServicioCoaching extends Servicio {
    @Column
    private Integer cantidadMozos;
    @Column
    private Double precioPorCadaMozo;

    /**
 *  Constructor por defecto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioCoaching() {

    }

    /**
 *  Constructor para asignar valores al Servicio de Coaching
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioCoaching(Integer cantidadMozos, Double precioPorCadaMozo) {
        this.cantidadMozos = cantidadMozos;
        this.precioPorCadaMozo = precioPorCadaMozo;
    }

    /**
 *  Constructor para asignar valores al Servicio de Coaching
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioCoaching(int id, double precio, String descripcion, Integer cantidadMozos,
            Double precioPorCadaMozo) {
        super(id, precio, descripcion);
        this.cantidadMozos = cantidadMozos;
        this.precioPorCadaMozo = precioPorCadaMozo;
    }

    /**
 *  Metodo Sobrescrito para calcular el monto total a pagar del Servicio
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public double getCalcularMontoTotal() {
        return cantidadMozos * precioPorCadaMozo;
    }

    //Metodos Getters y Setters

    public Integer getCantidadMozos() {
        return cantidadMozos;
    }

    public void setCantidadMozos(Integer cantidadMozos) {
        this.cantidadMozos = cantidadMozos;
    }

    public Double getPrecioPorCadaMozo() {
        return precioPorCadaMozo;
    }

    public void setPrecioPorCadaMozo(Double precioPorCadaMozo) {
        this.precioPorCadaMozo = precioPorCadaMozo;
    }

     /**
 *  Metodo ToString para una visualizacion mejor de los atributos del Servicio de Coaching
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public String toString() {
        return "ServicioCoaching [cantidadMozos=" + cantidadMozos + ", precioPorCadaMozo=" + precioPorCadaMozo + "]";
    }

}
