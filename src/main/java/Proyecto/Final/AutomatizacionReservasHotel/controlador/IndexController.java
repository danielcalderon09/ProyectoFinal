package Proyecto.Final.AutomatizacionReservasHotel.controlador;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    @PreAuthorize("hasRole('USER')")
    public String mostrarIndexUsuario() {
        return "index";
    }

    @GetMapping("/prueba")
    @PreAuthorize("hasRole('ADMIN')")
    public String mostrarPruebaAdmin() {
        return "prueba";
    }
}