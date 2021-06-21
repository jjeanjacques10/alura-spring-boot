package br.com.alura.forum.repository;

import br.com.alura.forum.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

   Optional<Usuario> findByEmail(String email);

}
