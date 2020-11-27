package ar.edu.unju.fi.modelo.dominio.aplicacion;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  Clase que representa a un Servicio de Adorno del Salon que hereda de la Clase Servicio
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

@Entity
@DiscriminatorValue("ServicioAL")
@Table(name = "ServiciosAdornoLugar")
public class ServicioAdornoLugar extends Servicio {
  
    @Column
    private Integer cantidadDeTelas;
    @Column
    private Double precioPorTela;


     /**
 *  Constructor por defecto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioAdornoLugar() {

    }

/**
 *  Constructor para asignar valores al Servicio de Adornos del Lugar
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

    public ServicioAdornoLugar(Integer cantidadDeTelas, Double precioPorTela) {
        this.cantidadDeTelas = cantidadDeTelas;
        this.precioPorTela = precioPorTela;
    }

/**
 *  Constructor para asignar valores al Servicio de Adornos del Lugar
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioAdornoLugar(int id, double precio, String descripcion, Integer cantidadDeTelas,
            Double precioPorTela) {
        super(id, precio, descripcion);
        this.cantidadDeTelas = cantidadDeTelas;
        this.precioPorTela = precioPorTela;
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
        return precioPorTela * cantidadDeTelas;
    }

     //Metodos Getters y Setters

    public Integer getCantidadDeTelas() {
        return cantidadDeTelas;
    }

    public void setCantidadDeTelas(Integer cantidadDeTelas) {
        this.cantidadDeTelas = cantidadDeTelas;
    }

    public Double getPrecioPorTela() {
        return precioPorTela;
    }

    public void setPrecioPorTela(Double precioPorTela) {
        this.precioPorTela = precioPorTela;
    }

/**
 *  Metodo ToString para una visualizacion mejor de los atributos del Servicio de Adornos del Lugar
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */

    @Override
    public String toString() {
        return "ServicioAdornoLugar [cantidadDeTelas=" + cantidadDeTelas + ", precioPorTela=" + precioPorTela + "]";
    }

}

