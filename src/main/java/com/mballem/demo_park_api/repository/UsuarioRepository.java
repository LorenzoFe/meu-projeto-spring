package com.mballem.demo_park_api.repository;

import com.mballem.demo_park_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);

    @Query("select u.role from Usuario u where u.username = :username")
    Usuario.Role findRoleByUsername(@Param("username") String username);
}
