
package com.portfolio.sciangula.Security.Repository;

import com.portfolio.sciangula.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario)
;
boolean existByNombreUsuario(String email);

    public boolean existsByEmail(String email);
        }
