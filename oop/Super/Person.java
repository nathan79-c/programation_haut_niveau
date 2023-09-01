package oop.Super;

import oop.Data.Contact;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

abstract public class Person {
    protected String name;
    protected String lastName;
    protected String firstName;
    protected char gender;
    protected LocalDate birthDate;

    protected class Contact {
        private final Set<Person> directory = new HashSet<>();

        public Contact store(Person person) {
            directory.add(person);
            return this;
        }

        public Set<Person> getAll() {
            return directory;
        }
    }

    public Person(String name, String firstName, String lastName, char gender){
        this.setName(name).setFirstName(firstName).setLastName(lastName).setGender(gender);
    }
    public Person(){
        this.setName("").setFirstName("").setLastName("")/*.setMatriculate("")*/.setGender('F');
    }


    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public Person setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public static void print() {
        System.out.println("TODO");
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public String toString() {
        return "Person {" +
                "\n\tname= '" + name + '\'' +
                ",\n\t lastName= '" + lastName + '\'' +
                ",\n\t firstName= '" + firstName + '\'' +
                /*",\n\t birthday= '" + birthDate.getDay() + '\'' +*/
                ",\n\t birth-month= '" + birthDate.getMonth() + '\'' +
                ",\n\t birth-year= '" + birthDate.getYear() + '\'' +
                ",\n\t gender= " + gender + "\n" +
                '}';
    }

    abstract public void show() ;
}
