package com.example.demo.mapper;

import com.example.demo.entity.Author;
import com.example.demo.model.AuthorDTO;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public Author fromDTOtoAuthor(AuthorDTO authorDTO){

        return Author.builder().id(authorDTO.getId()).name(authorDTO.getName()).biography(authorDTO.getBiography()).build();
    }

    public AuthorDTO fromAuthorToDTO(Author author){

        return AuthorDTO.builder().id(author.getId()).name(author.getName()).biography(author.getBiography()).build();
    }
}
