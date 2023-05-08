package com.scianguweb.sciangulasofia.service;

import com.scianguweb.sciangulasofia.Interface.IPersonaService;
import com.scianguweb.sciangulasofia.entity.Persona;
import com.scianguweb.sciangulasofia.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    public IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        return ipersonaRepository.findAll();

    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return ipersonaRepository.findById(id).orElse(null);
    }

}
