package com.scianguweb.sciangulasofia.security.Repository;

import com.scianguweb.sciangulasofia.security.entity.Rol;
import com.scianguweb.sciangulasofia.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
