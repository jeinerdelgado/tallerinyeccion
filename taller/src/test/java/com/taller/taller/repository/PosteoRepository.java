package com.taller.taller.repository;


import com.taller.taller.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IPosteoRepository {

    private final List<Posteo> posteos = new ArrayList<>();

    public PosteoRepository() {
        // Datos iniciales
        posteos.add(new Posteo(1L, "Primer post", "Jeiner"));
        posteos.add(new Posteo(2L, "Segundo post", "Maria"));
    }

    @Override
    public List<Posteo> findAll() {
        return posteos;
    }

    @Override
    public Posteo findById(Long id) {
        return posteos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Posteo posteo) {
        posteos.add(posteo);
    }
}

