package oop;

import oop.Data.Cote;
import oop.Interface.Evaluable;
import oop.Super.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Evaluable {
    private static int order = 0;
    public static int nombreEtudiants = 0;
    public String matriculate;
    private List<Cote> cotes;
    
    public Student(String name, String firstName, String lastName, char gender){
        super(name, firstName, lastName, gender);
        order++;
        this.matriculate = genererMatricule();
    }
    
    public Student(){
        this.setName("").setFirstName("").setLastName("").setMatriculate("").setGender('F');
        order++;
        this.matriculate = genererMatricule();
    }
    
    public List<Cote> getCotes() {
        return cotes;
    }

    public void setCotes(List<Cote> cotes) {
        this.cotes = cotes;
    }

    public void ajouterCote(Cote cote) {
        if (this.cotes == null) {
            this.cotes = new ArrayList<>();
        }
        this.cotes.add(cote);
    }
    
    public String getMatriculate() {
        return matriculate;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Student setMatriculate(String matriculate) {
        this.matriculate = matriculate;
        return this;
    }
    public String genererMatricule(){
        return String.valueOf (LocalDate.now().getYear() % 2000) + name.charAt(0) + lastName.charAt(0) +
        ((nombreEtudiants < 10) ? "00" :
        (nombreEtudiants < 100) ? "0"  : "" )+ order;
    }

    public Student setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public static void print() {
        System.out.println("TODO");
    }

   
   @Override
   public String toString() {
       return "Student{" +
           "\n\t name = '" + name + '\'' +
           ",\n\t lastName = '" + lastName + '\'' +
           ",\n\t firstName = '" + firstName + '\'' +
           ",\n\t matriculate = '" + getMatriculate() + '\'' +
           ",\n\t birthdate = '" + birthDate + '\'' +
           ",\n\t gender = " + gender +
           ",\n\t mention = '" + getMention() + "'" +
           ",\n\t totalGeneral = " + getCote() +
           "\n}";
   }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public Evaluable showMention(double percentage) {
        if (percentage >= 90) {
            System.out.println("Mention: Très bien");
        } else if (percentage >= 80) {
            System.out.println("Mention: Bien");
        } else if (percentage >= 70) {
            System.out.println("Mention: Assez bien");
        } else if (percentage >= 60) {
            System.out.println("Mention: Passable");
        } else {
            System.out.println("Mention: Insuffisant");
        }
        
        return this;
    }
    

    @Override
    public double computePercentage(List<Cote> cotes) {
        double total = 0;
        for (Cote cote : cotes) {
            total += cote.getValeur();
        }
        double average = total / cotes.size();
        return average;
    }
    public String getMention() {
        double percentage = computePercentage(cotes);
        if (percentage >= 90) {
            return "Très bien";
        } else if (percentage >= 80) {
            return "Bien";
        } else if (percentage >= 70) {
            return "Assez bien";
        } else if (percentage >= 60) {
            return "Passable";
        } else {
            return "Insuffisant";
        }
    }
    public double getCote() {
        double total = 0;
        for (Cote cote : cotes) {
            total += cote.getValeur();
        }
        return total;
    }
}