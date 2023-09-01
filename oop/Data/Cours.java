package oop.Data;

import java.util.ArrayList;
import java.util.List;

import oop.Teacher;

public class Cours {

    private int id;
    private String nom;
    private List<Epreuve> epreuves;
    private Teacher teacher;

    public Cours() {
    }

    public Cours(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.epreuves = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Epreuve> getEpreuves() {
        return epreuves;
    }

    public void setEpreuves(List<Epreuve> epreuves) {
        this.epreuves = epreuves;
    }

    public void ajouterEpreuve(Epreuve epreuve) {
        this.epreuves.add(epreuve);
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
