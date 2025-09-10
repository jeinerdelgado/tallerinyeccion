package com.taller.taller.controller;


import com.taller.taller.model.Posteo;
import com.taller.taller.service.IPosteoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {

    private final IPosteoService posteoService;

    public PosteoController(IPosteoService posteoService) {
        this.posteoService = posteoService;
    }

    @GetMapping
    public List<Posteo> getAllPosteos() {
        return posteoService.findAll();
    }

    @GetMapping("/{id}")
    public Posteo getPosteoById(@PathVariable Long id) {
        return posteoService.findById(id);
    }

    @PostMapping("/crear")
    public String crearPosteo(@RequestBody Posteo posteo) {
        posteoService.save(posteo);
        return "Posteo creado con éxito!";
    }
}

