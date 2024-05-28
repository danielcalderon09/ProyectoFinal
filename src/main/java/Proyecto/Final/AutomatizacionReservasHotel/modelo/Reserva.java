package Proyecto.Final.AutomatizacionReservasHotel.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate checkIn;

    @Column(nullable = false)
    private LocalDate checkOut;

    @Column(nullable = false)
    private int numPersonas;

    @Column(nullable = false)
    private String tipoHabitacion;

    private String servicio; // Opcional

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Reserva(Long id, LocalDate checkIn, LocalDate checkOut, int numPersonas, String tipoHabitacion, String servicio, String nombre, String apellido, String telefono, String email) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numPersonas = numPersonas;
        this.tipoHabitacion = tipoHabitacion;
        this.servicio = servicio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public Reserva(LocalDate checkIn, LocalDate checkOut, int numPersonas, String tipoHabitacion, String servicio, String nombre, String apellido, String telefono, String email) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numPersonas = numPersonas;
        this.tipoHabitacion = tipoHabitacion;
        this.servicio = servicio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public Reserva() {
    }
}

