package io.github.andreisanderson.libraryapi.controller.dto;

import java.time.LocalDate;

//DTO = Data Transfer Object

public record AutorDTO(String nome, LocalDate dataNascimento, String nacionalidade) {
    
}
