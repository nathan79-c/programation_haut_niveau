package oop;

import oop.Data.Cote;
import oop.Super.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Principal {
    public static void main(String[] argv) {
        Student student = new Student();
        Person student2 = new Student();
        Person student3 = new Person() {
            @Override
            public void show() {
                System.out.println(this);
            }
        };
        Student student1 = new Student("Richard", "Kabemba", "Ilunga", 'M');
        Promotion promotion = new Promotion();

        String dateString = "2002-05-25";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate date = LocalDate.of(2002, 5, 25);
        LocalDate date1 = LocalDate.of(20023, 5, 25);

//        var date1 = (new SimpleDateFormat("yyyy-MM-dd")).parse("2002-05-25");


        student1.setBirthDate(date1);
        student.setBirthDate(date);

        student.setLastName("Otwel").setName("Zuck").setFirstName("Jean-Luc");
        promotion.add(student).add(student1).add(student);

        promotion.displayStudent();
        Cote cote = new Cote();
cote.setStudent(new Student("John Doe", "John", "Doe", 'M'));
cote.getStudent();
    }
}
