package io.github.andreisanderson.libraryapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andreisanderson.libraryapi.controller.dto.AutorDTO;
import io.github.andreisanderson.libraryapi.model.Autor;

@RestController
@RequestMapping("/autores")
//  http://localhost:8080/autores
public class AutorController {
    
    @PostMapping
    public ResponseEntity salvar(@RequestBody AutorDTO autor){
        
        return new ResponseEntity("Autor salvo com sucesso!" + autor, HttpStatus.CREATED);
    }
}
