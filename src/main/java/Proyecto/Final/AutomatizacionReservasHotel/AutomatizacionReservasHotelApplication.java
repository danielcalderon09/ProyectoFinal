package Proyecto.Final.AutomatizacionReservasHotel;

import Proyecto.Final.AutomatizacionReservasHotel.modelo.Usuario;
import Proyecto.Final.AutomatizacionReservasHotel.servicios.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AutomatizacionReservasHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomatizacionReservasHotelApplication.class, args);
	}


}

