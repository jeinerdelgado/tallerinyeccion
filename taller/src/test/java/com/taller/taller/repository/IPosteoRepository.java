package com.taller.taller.repository;

import com.taller.taller.model.Posteo;
import java.util.List;

public interface IPosteoRepository {
    List<Posteo> findAll();
    Posteo findById(Long id);
    void save(Posteo posteo);
}

