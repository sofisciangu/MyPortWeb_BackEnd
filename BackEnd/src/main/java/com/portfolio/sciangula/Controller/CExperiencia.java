
package com.portfolio.sciangula.Controller;

import com.portfolio.sciangula.Dto.dtoExperiencia;
import com.portfolio.sciangula.Entry.Experiencia;
import com.portfolio.sciangula.Service.SExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expelab")
@CrossOrigin(origins="http://localhost:4200")


public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    @GetMapping("/lista")
    
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list=sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
     }
     public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){
         if(StringUtils.isBlank(dtoexp.getNombreE()))
             return new ResponseEntity(new Mensaje ("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
         if(sExperiencia.existsByNombreE(dtoexp.getNombreE()));
     }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = sExperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
}
