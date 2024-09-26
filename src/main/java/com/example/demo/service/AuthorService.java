package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.mapper.AuthorMapper;
import com.example.demo.model.AuthorDTO;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthorService {

    @Autowired
    AuthorMapper authorMapper;

    @Autowired
    AuthorRepository authorRepository;

    public AuthorDTO createNewAuthor ( AuthorDTO authorDTO)throws Exception{

        if(authorDTO.getName() == null){
            throw new Exception("Nome non valorizzato");
        }

        Author newAuthor = authorMapper.fromDTOtoAuthor(authorDTO);

        newAuthor = authorRepository.save(newAuthor);

        return authorMapper.fromAuthorToDTO(newAuthor);
    }

}
