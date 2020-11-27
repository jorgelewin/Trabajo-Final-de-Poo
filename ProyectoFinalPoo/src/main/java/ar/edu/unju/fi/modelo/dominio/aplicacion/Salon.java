package ar.edu.unju.fi.modelo.dominio.aplicacion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa a un Salon para el evento Social
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@Table(name = "Salones")
public class Salon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "salon_codigo")
    private int id;
    @Column
    private String nombre;
    @Column
    private String ubicacion;
    @Column
    private Integer capacidadMaxima;
    @Column
    private Double precio;

    /**
     * Constructor por defecto
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public Salon() {
    }

    /**
     * Constructor para asignar valores al Salon
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public Salon(int id, String nombre, String ubicacion, Integer capacidadMaxima, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
        this.precio = precio;
    }

    // Metodos Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Metodo ToString para una visualizacion mejor de los atributos del Salon
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @Override
    public String toString() {
        return "Salon [capacidadMaxima=" + capacidadMaxima + ", id=" + id + ", nombre=" + nombre + ", precio=" + precio
                + ", ubicacion=" + ubicacion + "]";
    }

}
