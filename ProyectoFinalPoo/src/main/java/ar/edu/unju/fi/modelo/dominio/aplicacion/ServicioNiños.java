package ar.edu.unju.fi.modelo.dominio.aplicacion;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Clase que representa a un Servicio de niños que hereda de la Clase Servicio
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@DiscriminatorValue("ServicioN")
@Table(name = "ServiciosNiños")
public class ServicioNiños extends Servicio {
    @Column
    private Integer cantidadNiños;
    @Column
    private Double precioPorNiños;

    /**
 *  Constructor por defecto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioNiños() {

    }

    /**
 *  Constructor para asignar valores al Servicio de Niños
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioNiños(Integer cantidadNiños, Double precioPorNiños) {
        this.cantidadNiños = cantidadNiños;
        this.precioPorNiños = precioPorNiños;
    }

    /**
 *  Constructor para asignar valores al Servicio de Niños
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioNiños(int id, double precio, String descripcion, Integer cantidadNiños, Double precioPorNiños) {
        super(id, precio, descripcion);
        this.cantidadNiños = cantidadNiños;
        this.precioPorNiños = precioPorNiños;
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
        return cantidadNiños * precioPorNiños;
    }
    
    //Metodos Getters y Setters

    public Integer getCantidadNiños() {
        return cantidadNiños;
    }

    public void setCantidadNiños(Integer cantidadNiños) {
        this.cantidadNiños = cantidadNiños;
    }

    public Double getPrecioPorNiños() {
        return precioPorNiños;
    }

    public void setPrecioPorNiños(Double precioPorNiños) {
        this.precioPorNiños = precioPorNiños;
    }


/**
 *  Metodo ToString para una visualizacion mejor de los atributos del Servicio de Niños
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public String toString() {
        return "ServicioNiños [cantidadNiños=" + cantidadNiños + ", precioPorNiños=" + precioPorNiños + "]";
    }

}