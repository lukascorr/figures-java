package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.FigureModel;

@Repository
public interface FigureRepository extends CrudRepository<FigureModel, Long> {

}