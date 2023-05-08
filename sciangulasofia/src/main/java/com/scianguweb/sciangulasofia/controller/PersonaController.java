package com.scianguweb.sciangulasofia.controller;

import com.scianguweb.sciangulasofia.Interface.IPersonaService;
import com.scianguweb.sciangulasofia.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = {"https://frontendsciangula.web.app", "http://localhost:4200"})
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("persona/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PreAuthorize("hasROLE('ADMIN')")
    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "Persona creada correctamente";
    }

    @PreAuthorize("hasROLE('ADMIN')")
    @DeleteMapping("/persona/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "Persona eliminada correctamente";
    }

    @PreAuthorize("hasROLE('ADMIN')")
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apeliido") String nuevoApellido) {

        Persona persona = ipersonaService.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);

        ipersonaService.savePersona(persona);
        return persona;
    }

}
