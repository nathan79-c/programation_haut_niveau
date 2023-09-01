package oop;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import oop.Data.Cote;
import oop.Data.Cours;
import oop.Promotion;
import oop.Student;
import oop.Teacher;

public class Main2 {
    public static void main(String[] args) {
        try {
            // Création de la promotion
            Promotion promotion = new Promotion();

            // Ajout des étudiants à la promotion
            Student student1 = new Student("John", "Doe", "kasongo", 'M');
            Student student2 = new Student("Jane", "Smith", "patience", 'F');
            promotion.add(student1);
            promotion.add(student2);

            // Création du professeur
            Teacher teacher = new Teacher("Jane Doe", "Jane", "Doe", 'F', null);

            // Création du cours
            Cours cours = new Cours(1, "Mathématiques");

            // Ajout du cours à la liste des cours du professeur
           // teacher.ajouterCours(cours);
            // Attribution du cours au professeur
            cours.setTeacher(teacher);

            // Ajout des notes des étudiants dans le cours
            Cote cote1 = new Cote(1, "Devoir 1", 80);
            Cote cote2 = new Cote(2, "Devoir 2", 90);
            student1.ajouterCote(cote1);
            student1.ajouterCote(cote2);

            // Calcul de la moyenne des notes de chaque étudiant
            double percentage1 = student1.computePercentage(student1.getCotes());
           // double percentage2 = student2.computePercentage(student2.getCotes());

            // Affichage de la mention de chaque étudiant
            student1.showMention(percentage1);
            //student2.showMention(percentage2);

            // Enregistrement des informations dans un fichier
            FileWriter writer = new FileWriter("informations.txt");
            writer.write("Informations des étudiants:\n");
            writer.write(student1.toString() + "\n");
            writer.write(student2.toString() + "\n");
            writer.close();

            // Lecture du fichier et affichage des informations à l'écran
            FileReader reader = new FileReader("informations.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la manipulation du fichier.");
            e.printStackTrace();
        }
    }
}
