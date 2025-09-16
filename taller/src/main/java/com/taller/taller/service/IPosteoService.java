package com.taller.taller.service;

import com.taller.taller.model.Posteo;
import java.util.List;

public interface IPosteoService {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
    void delete(Long id);
}


