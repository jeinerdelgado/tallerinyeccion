package com.taller.taller.service;


import com.taller.taller.model.Posteo;
import com.taller.taller.repository.IPosteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IPosteoService {

    private final IPosteoRepository posteoRepository;

    // 🔹 Inyección de dependencias por constructor
    public PosteoService(IPosteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> findAll() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo findById(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public void save(Posteo posteo) {
        posteoRepository.save(posteo);
    }
}

