package br.com.luancassanho.loginsenha.repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luancassanho.loginsenha.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
