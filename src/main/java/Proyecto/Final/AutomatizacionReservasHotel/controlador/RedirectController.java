package Proyecto.Final.AutomatizacionReservasHotel.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/index.html")
    public String inicio() {
        return "index";
    }

    @GetMapping("/reserva.html")
    public String reserva() {
        return "reserva";
    }

    @GetMapping("/servicios.html")
    public String servicios() {
        return "servicios";
    }

    @GetMapping("/nosotros.html")
    public String nosotros() {
        return "nosotros";
    }

    @GetMapping("/reserva-final.html")
    public String reservafinal() {
        return "reserva-final";
}}