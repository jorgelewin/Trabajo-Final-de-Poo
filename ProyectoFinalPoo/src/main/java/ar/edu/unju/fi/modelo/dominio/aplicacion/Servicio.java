package ar.edu.unju.fi.modelo.dominio.aplicacion;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Clase Abstracta para representar a los Servicios que luego cada servicio en
 * especifico heredara de esta clase
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "service_type")
@Table(name = "Servicios")
public abstract class Servicio {

    @Id
    @Column(name = "servicio_codigo")
    private int id;
    @Column
    private double precio;
    @Column
    private String descripcion;

    /**
     * Constructor por defecto
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public Servicio() {
    }

    /**
     * Constructor para asignar valores al Servicio
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public Servicio(int id, double precio, String descripcion) {
        this.id = id;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    /**
     * Metodo Abstracto para sobrescribirlo en cada servicio especifico
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public abstract double getCalcularMontoTotal();

    // Metodos Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo ToString para una visualizacion mejor de los atributos del Servicio
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @Override
    public String toString() {
        return "Servicio [descripcion=" + descripcion + ", id=" + id + ", precio=" + precio + "]";
    }

}