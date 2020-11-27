package ar.edu.unju.fi.modelo.dominio.aplicacion;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  Clase que representa a un Servicio de comida que hereda de la Clase Servicio
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@DiscriminatorValue("ServicioC")
@Table(name = "ServicioComidas")
public class ServicioComida extends Servicio {
    @Column
    private Integer cantidadPlatosPrincipal;
    @Column
    private double precioPorPlatoPrincipal;
    @Column
    private String tipoComidaPrincipalDescripcion;
    @Column
    private Integer cantidadPlatosPostre;
    @Column
    private double precioPorPlatoPostre;
    @Column
    private String tipoComidaPostreDescripcion;

    /**
 *  Constructor por defecto
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioComida() {

    }

    /**
 *  Constructor para asignar valores al Servicio de Comida
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioComida(Integer cantidadPlatosPrincipal, double precioPorPlatoPrincipal,
            String tipoComidaPrincipalDescripcion, Integer cantidadPlatosPostre, double precioPorPlatoPostre,
            String tipoComidaPostreDescripcion) {
        this.cantidadPlatosPrincipal = cantidadPlatosPrincipal;
        this.precioPorPlatoPrincipal = precioPorPlatoPrincipal;
        this.tipoComidaPrincipalDescripcion = tipoComidaPrincipalDescripcion;
        this.cantidadPlatosPostre = cantidadPlatosPostre;
        this.precioPorPlatoPostre = precioPorPlatoPostre;
        this.tipoComidaPostreDescripcion = tipoComidaPostreDescripcion;
    }

    /**
 *  Constructor para asignar valores al Servicio de Comida
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    public ServicioComida(int id, double precio, String descripcion, Integer cantidadPlatosPrincipal,
            double precioPorPlatoPrincipal, String tipoComidaPrincipalDescripcion, Integer cantidadPlatosPostre,
            double precioPorPlatoPostre, String tipoComidaPostreDescripcion) {
        super(id, precio, descripcion);
        this.cantidadPlatosPrincipal = cantidadPlatosPrincipal;
        this.precioPorPlatoPrincipal = precioPorPlatoPrincipal;
        this.tipoComidaPrincipalDescripcion = tipoComidaPrincipalDescripcion;
        this.cantidadPlatosPostre = cantidadPlatosPostre;
        this.precioPorPlatoPostre = precioPorPlatoPostre;
        this.tipoComidaPostreDescripcion = tipoComidaPostreDescripcion;
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

        return (cantidadPlatosPrincipal * precioPorPlatoPrincipal) + (cantidadPlatosPostre * precioPorPlatoPostre);
    }

    //Metodos Getters y Setters

    public Integer getCantidadPlatosPrincipal() {
        return cantidadPlatosPrincipal;
    }

    public void setCantidadPlatosPrincipal(Integer cantidadPlatosPrincipal) {
        this.cantidadPlatosPrincipal = cantidadPlatosPrincipal;
    }

    public double getPrecioPorPlatoPrincipal() {
        return precioPorPlatoPrincipal;
    }

    public void setPrecioPorPlatoPrincipal(double precioPorPlatoPrincipal) {
        this.precioPorPlatoPrincipal = precioPorPlatoPrincipal;
    }

    public String getTipoComidaPrincipalDescripcion() {
        return tipoComidaPrincipalDescripcion;
    }

    public void setTipoComidaPrincipalDescripcion(String tipoComidaPrincipalDescripcion) {
        this.tipoComidaPrincipalDescripcion = tipoComidaPrincipalDescripcion;
    }

    public Integer getCantidadPlatosPostre() {
        return cantidadPlatosPostre;
    }

    public void setCantidadPlatosPostre(Integer cantidadPlatosPostre) {
        this.cantidadPlatosPostre = cantidadPlatosPostre;
    }

    public double getPrecioPorPlatoPostre() {
        return precioPorPlatoPostre;
    }

    public void setPrecioPorPlatoPostre(double precioPorPlatoPostre) {
        this.precioPorPlatoPostre = precioPorPlatoPostre;
    }

    public String getTipoComidaPostreDescripcion() {
        return tipoComidaPostreDescripcion;
    }

    public void setTipoComidaPostreDescripcion(String tipoComidaPostreDescripcion) {
        this.tipoComidaPostreDescripcion = tipoComidaPostreDescripcion;
    }

     /**
 *  Metodo ToString para una visualizacion mejor de los atributos del Servicio de Comida
 * 
 * @version 1.0 
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
    @Override
    public String toString() {
        return "ServicioComida [cantidadPlatosPostre=" + cantidadPlatosPostre + ", cantidadPlatosPrincipal="
                + cantidadPlatosPrincipal + ", precioPorPlatoPostre=" + precioPorPlatoPostre
                + ", precioPorPlatoPrincipal=" + precioPorPlatoPrincipal + ", tipoComidaPostreDescripcion="
                + tipoComidaPostreDescripcion + ", tipoComidaPrincipalDescripcion=" + tipoComidaPrincipalDescripcion
                + "]";
    }

}
