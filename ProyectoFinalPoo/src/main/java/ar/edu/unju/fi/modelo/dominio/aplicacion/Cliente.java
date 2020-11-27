package ar.edu.unju.fi.modelo.dominio.aplicacion;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que representa a un Cliente
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cliente_codigo")
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String domicilio;
    @Column
    private String telefono;

    /**
     * Constructor por defecto
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public Cliente() {
    }

    /**
     * Constructor para asignar valores al Cliente
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public Cliente(int id, String nombre, String apellido, String domicilio, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo ToString para una visualizacion mejor de los atributos del Cliente
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", domicilio=" + domicilio + ", id=" + id + ", nombre=" + nombre
                + ", telefono=" + telefono + "]";
    }

}
