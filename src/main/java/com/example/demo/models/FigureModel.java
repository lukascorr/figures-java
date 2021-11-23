package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "figures")
public class FigureModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private Float superficie;
    private Float base;
    private Float altura;
    private Float diametro;
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getDiametro() {
        return diametro;
    }

    public void setDiametro(Float diametro) {
        this.diametro = diametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}