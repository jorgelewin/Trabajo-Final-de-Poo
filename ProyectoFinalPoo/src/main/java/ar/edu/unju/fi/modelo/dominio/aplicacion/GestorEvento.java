package ar.edu.unju.fi.modelo.dominio.aplicacion;

import java.util.List;

/**
 * Clase para gestionar los eventos Sociales Registrados
 * 
 * @version 1.0
 * @since 20/10/2020
 * @author Mauro Ayarde - Jorge Lewin
 *
 */
public class GestorEvento {

    List<EventoSocial> eventos;

    /**
     * Constructor por defecto
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public GestorEvento() {
    }

    /**
     * Constructor para asignar una lista de eventos y luego gestionarla
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */
    public GestorEvento(List<EventoSocial> eventos) {
        this.eventos = eventos;
    }

    /**
     * Metodo para mostrar los eventos en una fecha predeterminada (Quedo pendiente
     * para aplicarlo a la hora de agregar la Interfaz de Usuario)
     * 
     * @version 1.0
     * @since 20/10/2020
     * @author Mauro Ayarde - Jorge Lewin
     *
     */

    /*
     * public static void getMostrarEventos(Date fechaInicial, Date fechaFin) { }
     */
    /*
     * public void getMostrarEventos() { for (EventoSocial event : eventos) {
     * System.out.println(event.toString()); }
     * 
     * }
     */

    // Metodos Getters y Setters
    public List<EventoSocial> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoSocial> eventos) {
        this.eventos = eventos;
    }

}
