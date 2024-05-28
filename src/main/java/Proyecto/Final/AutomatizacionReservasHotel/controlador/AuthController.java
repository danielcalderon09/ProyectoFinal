package Proyecto.Final.AutomatizacionReservasHotel.controlador;

import Proyecto.Final.AutomatizacionReservasHotel.modelo.Usuario;
import Proyecto.Final.AutomatizacionReservasHotel.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        Usuario usuario = usuarioService.obtenerUsuarioPorEmail(email);

        if (usuario != null && usuarioService.verificarPassword(password, usuario.getPassword())) {

            if (usuario.getRoles().stream().anyMatch(rol -> rol.getNombre().equals("ADMIN"))) {
                return "redirect:/prueba";
            } else {
                return "redirect:/index";
            }
        } else {
            // Credenciales incorrectas
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registro";
        }

        usuarioService.registrarUsuario(usuario);
        model.addAttribute("exito", "Registro exitoso");
        return "login";
    }
}
