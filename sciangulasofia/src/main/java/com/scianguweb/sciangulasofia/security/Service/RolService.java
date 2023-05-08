package com.scianguweb.sciangulasofia.security.Service;

import com.scianguweb.sciangulasofia.security.Repository.IRolRepository;
import com.scianguweb.sciangulasofia.security.entity.Rol;
import com.scianguweb.sciangulasofia.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {

    @Autowired
    IRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
