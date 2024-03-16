package org.maks.newclass;
import java.util.*;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Virginia","Hill", "women", LocalDate.of(2006, 8, 5), "France", "Hello", "Advanced"));
        students.add(new Student("Jiang","Chen", "men", LocalDate.of(2007, 7, 4), "China", "您好", "Intermediate"));
        students.add(new Student("Aramaki","Mitsuyuki", "men", LocalDate.of(2006, 1, 8), "Japan", "konichiwa", "Intermediate"));
        students.add(new Student("Chloe","Ferrer", "women", LocalDate.of(2006, 12, 20), "Spain", "¡Hola", "Beginner"));
        students.add(new Student("Johan","Anderson", "men", LocalDate.of(2005, 6, 3), "Africa", "Jambo", "Advanced"));
        students.add(new Student("Frank","Abel", "men", LocalDate.of(2006, 11, 13), "Germany", "Gruess dich", "Beginner"));
        students.add(new Student("Josef","Huber", "men", LocalDate.of(2004, 4, 7), "Austria", "Servus ", "Intermediate"));
        students.add(new Student("Amanda","Williams", "women", LocalDate.of(2006, 10, 27), "Australia", "G’day ", "Advanced"));

        Greeting(students);

        EnglishLevelList(students);

        System.out.println(" ");

        Duty(students);

    }
    static List<Student> Greeting(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGender().equals("men")) {
                System.out.println("Студент: " + students.get(i).getName() +" "+ students.get(i).getSurname()+" - " + "приветствие: " + students.get(i).getWelcome());
            } else {
                System.out.println("Студентка: " + students.get(i).getName() +" "+ students.get(i).getSurname() +" - " + "приветствие: " + students.get(i).getWelcome());
            }
        }
        return students;
    }
    static List<Student> EnglishLevelList(List<Student> students){
        final String reset = "\u001B[0m";
        final String red = "\u001B[31m";
        final String yellow = "\u001B[33m";
        final String green = "\u001B[32m";
        System.out.println(green + "Advanced: " + reset);
        students.stream().filter(s -> Objects.equals(s.getLevelEnglish(), "Advanced"))
                .sorted(new StudentComparator())
                .forEach(s->System.out.println(s.getName()+" "+s.getSurname()));
        System.out.println(yellow + "Intermediate: " + reset);
        students.stream().filter(s -> Objects.equals(s.getLevelEnglish(), "Intermediate"))
                .sorted(new StudentComparator())
                .forEach(s->System.out.println(s.getName()+" "+s.getSurname()));

        System.out.println(red + "Beginner: " + reset);
        students.stream().filter(s -> Objects.equals(s.getLevelEnglish(), "Beginner"))
                .sorted(new StudentComparator())
                .forEach(s->System.out.println(s.getName()+" "+s.getSurname()));
        return students;
    }
    static List<Student> Duty(List<Student> students) {
        students.sort((x, y) -> y.getDateOfBirth().compareTo(x.getDateOfBirth()));

        System.out.println("Дежурный: " + students.get(0).getName() + " - " + students.get(0).getDateOfBirth());
        return students;
    }

    static class StudentComparator implements Comparator<Student>{

        public int compare(Student a, Student b){

            return a.getName().compareTo(b.getName());
        }
    }

}
