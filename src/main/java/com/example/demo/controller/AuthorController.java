package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.model.AuthorDTO;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping()
    public ResponseEntity<?> createNewAuthor(@RequestBody AuthorDTO authorDTO) {

        try {
            AuthorDTO newAuthorDTO = authorService.createNewAuthor(authorDTO);
            return ResponseEntity.ok(newAuthorDTO);

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
