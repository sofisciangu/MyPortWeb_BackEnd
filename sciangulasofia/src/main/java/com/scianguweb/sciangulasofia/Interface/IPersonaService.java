/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.scianguweb.sciangulasofia.Interface;

import com.scianguweb.sciangulasofia.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
    //Traer una lista de personas

    public List<Persona> getPersona();

    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);

    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);

    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
