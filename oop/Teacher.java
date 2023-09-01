package oop;

import java.util.ArrayList;
import java.util.List;

import oop.Data.Cours;
import oop.Super.Person;

public class Teacher extends Person {
    private String grade;
    private int numberOfTeacher = 0;
    private List<Cours> cours;
    


    public String getGrade() {
        return grade;
    }

    public Teacher setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public Teacher(String name, String firstName, String lastName, char gender, String grade) {
        super(name, firstName, lastName, gender);
        this.grade = grade;
        this.cours = new ArrayList<>();
        numberOfTeacher++;
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Teacher {\n");
    sb.append("\tname = '").append(name).append("'\n");
    sb.append("\tlastName = '").append(lastName).append("'\n");
    sb.append("\tfirstName = '").append(firstName).append("'\n");
    sb.append("\tGrade = '").append(grade).append("'\n");
    sb.append("\tbirthdate = '").append(birthDate).append("'\n");
    sb.append("\tgender = ").append(gender).append("\n");
    sb.append("\tcours = [\n");
    for (Cours cours : this.cours) {
        sb.append("\t\t").append(cours.getNom()).append("\n");
    }
    sb.append("\t]\n");
    sb.append("}");

    return sb.toString();
}
    @Override
    public void show() {
        System.out.println(this);
    }
    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public void ajouterCours(Cours cours) {
        this.cours.add(cours);
    }
    
}
