
package com.portfolio.sciangula.Interface;

import com.portfolio.sciangula.Entry.Persona;
import java.util.List;

public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    //elimina un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    //buscar persona por ID
    public Persona findPersona(Long id);
    
}
