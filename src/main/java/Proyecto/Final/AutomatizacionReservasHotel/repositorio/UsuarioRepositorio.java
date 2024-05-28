package Proyecto.Final.AutomatizacionReservasHotel.repositorio;

import Proyecto.Final.AutomatizacionReservasHotel.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

        public Usuario findByEmail(String email);

    }

