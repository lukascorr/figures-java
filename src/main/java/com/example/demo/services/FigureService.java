package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.FigureModel;
import com.example.demo.repositories.FigureRepository;
import java.util.ArrayList;

@Service
public class FigureService {
    @Autowired
    FigureRepository figureRepository;

    public ArrayList<FigureModel> getFigures() {
        return (ArrayList<FigureModel>) figureRepository.findAll();
    }

    public FigureModel storeFigure(FigureModel figureModel) {
        return figureRepository.save(figureModel);
    }
}