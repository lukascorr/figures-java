package com.example.demo.controllers;

import com.example.demo.models.FigureModel;
import com.example.demo.services.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/figures")
public class FigureController {

    @Autowired
    FigureService figureService;

    @GetMapping()
    public ArrayList<FigureModel> getFigures() {
        return figureService.getFigures();
    }

    @PostMapping()
    public FigureModel storeFigure(@RequestBody FigureModel model) {
        return this.figureService.storeFigure(model);
    }
}