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


    @PostMapping
    public String crearPosteo(@RequestBody Posteo posteo) {
        System.out.println("Creando posteo: " + posteo.getTitulo());
        posteoService.save(posteo);
        return "Posteo creado con éxito!";
    }


    @PutMapping("/{id}")
    public String actualizarPosteo(@PathVariable Long id, @RequestBody Posteo posteo) {
        Posteo existente = posteoService.findById(id);
        if (existente != null) {
            existente.setTitulo(posteo.getTitulo());
            existente.setAuthor(posteo.getAuthor());
            posteoService.save(existente);
            return "Posteo actualizado con éxito!";
        }
        return "Posteo no encontrado!";
    }

    @DeleteMapping("/{id}")
    public String eliminarPosteo(@PathVariable Long id) {
        posteoService.delete(id);
        return "Posteo eliminado con éxito!";
    }
}



