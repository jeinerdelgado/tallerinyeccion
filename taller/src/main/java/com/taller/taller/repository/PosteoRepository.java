package com.taller.taller.repository;

import com.taller.taller.model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteoRepository extends JpaRepository<Posteo, Long> {
}



