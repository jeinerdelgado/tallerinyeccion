package com.taller.taller.service;

import com.taller.taller.model.Posteo;
import com.taller.taller.repository.PosteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IPosteoService {

    private final PosteoRepository posteoRepository;

    public PosteoService(PosteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> findAll() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo findById(Long id) {
        return posteoRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Posteo posteo) {
        posteoRepository.save(posteo);
    }

    @Override
    public void delete(Long id) {
        posteoRepository.deleteById(id);
    }
}



