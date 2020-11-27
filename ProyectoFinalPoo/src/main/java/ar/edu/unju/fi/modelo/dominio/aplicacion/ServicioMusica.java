package ar.edu.unju.fi.modelo.dominio.aplicacion;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  Clase que representa a un Servicio de musica que hereda de la Clase Servicio
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@DiscriminatorValue("ServicioM")
@Table(name = "ServicioMusica")
public class ServicioMusica extends Servicio {
    @Column
    private Integer cantidadParlante;
    @Column
    private Double precioPorParlante;


    /**
 *  Constructor por defecto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioMusica() {

    }


    /**
 *  Constructor para asignar valores al Servicio de Musica
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioMusica(Integer cantidadParlante, Double precioPorParlante) {
        this.cantidadParlante = cantidadParlante;
        this.precioPorParlante = precioPorParlante;
    }

    /**
 *  Constructor para asignar valores al Servicio de Musica
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

    public ServicioMusica(int id, double precio, String descripcion, Integer cantidadParlante,
            Double precioPorParlante) {
        super(id, precio, descripcion);
        this.cantidadParlante = cantidadParlante;
        this.precioPorParlante = precioPorParlante;
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
        return cantidadParlante * precioPorParlante;
    }


    //Metodos Getters y Setters

    public Integer getCantidadParlante() {
        return cantidadParlante;
    }

    public void setCantidadParlante(Integer cantidadParlante) {
        this.cantidadParlante = cantidadParlante;
    }

    public Double getPrecioPorParlante() {
        return precioPorParlante;
    }

    public void setPrecioPorParlante(Double precioPorParlante) {
        this.precioPorParlante = precioPorParlante;
    }

 /**
 *  Metodo ToString para una visualizacion mejor de los atributos del Servicio de Musica
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public String toString() {
        return "ServicioMusica [cantidadParlante=" + cantidadParlante + ", precioPorParlante=" + precioPorParlante
                + "]";
    }

}
