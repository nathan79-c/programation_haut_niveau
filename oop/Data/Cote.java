package oop.Data;

import oop.Student;

public class Cote {

    private int id;
    private String nom;
    private int valeur;
     private Student student;
    public Cote() {
    }

    public Cote(int id, String nom, int valeur) {
        this.id = id;
        this.nom = nom;
        this.valeur = valeur;
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

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
