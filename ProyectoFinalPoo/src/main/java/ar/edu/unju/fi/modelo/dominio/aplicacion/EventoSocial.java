package ar.edu.unju.fi.modelo.dominio.aplicacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase que representa un Evento Social
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
@Entity
@Table(name = "EventoSociales")
public class EventoSocial implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo_eventosocial")
    private int id;
    @Column
    private String horaInicio;
    @Column
    private String horaFin;
    @Column
    private boolean canceladoMonetariamente;
    @Column
    private double adelanto;
    @Column
    private Date fecha;
    @Column
    private String descripcion;
    @Column
    private Double saldo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_codigo")
    Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Salon> salones;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Servicio> servicios;

    /**
     * Constructor por defecto
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public EventoSocial() {
        salones = new ArrayList<>();
        servicios = new ArrayList<>();

    }

    /**
     * Constructor para asignar valores al Evento Social
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public EventoSocial(int id, String horaInicio, String horaFin, boolean canceladoMonetariamente, double adelanto,
            Date fecha, String descripcion, Double saldo, Cliente cliente) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.canceladoMonetariamente = canceladoMonetariamente;
        this.adelanto = adelanto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.saldo = saldo;
        this.cliente = cliente;
        salones = new ArrayList<>();
        servicios = new ArrayList<>();

    }

    /**
     * Metodo para agregar un Salon al evento Social
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void agregarSalon(Salon salon) {
        salones.add(salon);
    }

    /**
     * Metodo para agregar un Servicio al evento Social
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    /**
     * Metodo para registrar un adelanto del pago total del evento Social
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public void registrarAdelantoSaldo(double adelantoSaldo) {

        double monto = calcularMontoTotalEvento();

        if (adelantoSaldo > 0 && adelantoSaldo <= monto) {

            this.adelanto += adelantoSaldo;

            this.saldo -= adelantoSaldo;
        }

    }

    /**
     * Metodo que calcula y retorna el monto total a Pagar del evento Social
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public double calcularMontoTotalEvento() {

        double monto = 0;
        for (Servicio servicio : servicios) {
            monto += servicio.getCalcularMontoTotal();
        }

        for (Salon salon : salones) {

            monto += salon.getPrecio();

        }

        return monto;
    }

    // Metodos Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public boolean isCanceladoMonetariamente() {
        return canceladoMonetariamente;
    }

    public void setCanceladoMonetariamente(boolean canceladoMonetariamente) {
        this.canceladoMonetariamente = canceladoMonetariamente;
    }

    public double getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(double adelanto) {
        this.adelanto = adelanto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Salon> getSalones() {
        return salones;
    }

    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    /**
     * Metodo ToString para una visualizacion mejor de los atributos del Evento
     * Social
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    @Override
    public String toString() {
        return "EventoSocial [adelanto=" + adelanto + ", canceladoMonetariamente=" + canceladoMonetariamente
                + ", cliente=" + cliente + ", descripcion=" + descripcion + ", fecha=" + fecha + ", horaFin=" + horaFin
                + ", horaInicio=" + horaInicio + ", id=" + id + ", saldo=" + saldo + ", salones=" + salones
                + ", servicios=" + servicios + "]";
    }

}
