package org.maks.newclass;

import java.util.*;

import java.time.LocalDate;

import static org.maks.newclass.Gender.MEN;
import static org.maks.newclass.Gender.WOMEN;
import static org.maks.newclass.LevelEnglish.*;
import static org.maks.newclass.Country.*;

public class Main {

    public static void main(String[] args) {

        teacher();//Вызываем метод учителя
        List<Student> students = mockStudents();

        greeting(students);

//        englishLevelList(students);

        print(levelEnglish(students));

        System.out.println(" ");

        duty(students);

    }
    private static void teacher(){ //Создаем отдельный метод для учителя
        Teacher teacher = new Teacher();
        System.out.println(teacher.getWelcome()+" \n"+ "Меня зовут "+teacher.getName()+" "+teacher.getSurname());
        System.out.println("Я буду вести у вас такие предметы: \n"+teacher.getSubjects());
        System.out.println("");
    }
    private static void print(Map<LevelEnglish, List<Student>> levelEnglishListMap) {
        for(LevelEnglish level:  LevelEnglish.values()) {
            System.out.println("");
            System.out.println(getLevelTitle(level));
            levelEnglishListMap.get(level).forEach(s -> System.out.println(s.getName() + " " + s.getSurname()));
        }
    }

    private static List<Student> mockStudents() {
        List<Student> students = new ArrayList<>();
        new Country();
        students.add(new Student("Virginia", "Hill", WOMEN, LocalDate.of(2006, 8, 5), Country.map.get(1), "Hello", ADVANCED, new String[]{"English", "Franc"}));//Дополняем всех студентов языками которыми они владеют
        students.add(new Student("Jiang", "Chen", MEN, LocalDate.of(2007, 7, 4), Country.map.get(2), "您好", INTERMEDIATE, new String[]{"English", "China"}));
        students.add(new Student("Aramaki", "Mitsuyuki", MEN, LocalDate.of(2006, 1, 8), Country.map.get(3), "konichiwa", INTERMEDIATE, new String[]{"English", "Japan"}));
        students.add(new Student("Chloe", "Ferrer", WOMEN, LocalDate.of(2006, 12, 20), Country.map.get(4), "¡Hola", BEGINNER, new String[]{"English", "Spain"}));
        students.add(new Student("Johan", "Anderson", MEN, LocalDate.of(2005, 6, 3), Country.map.get(5), "Jambo", ADVANCED, new String[]{"English", "Africa"}));
        students.add(new Student("Frank", "Abel", MEN, LocalDate.of(2006, 11, 13), Country.map.get(6), "Gruess dich", BEGINNER, new String[]{"English", "Franc","Germany"}));
        students.add(new Student("Josef", "Huber", MEN, LocalDate.of(2004, 4, 7), Country.map.get(7), "Servus ", INTERMEDIATE, new String[]{"English", "Austria"}));
        students.add(new Student("Amanda", "Williams", WOMEN, LocalDate.of(2006, 10, 27), Country.map.get(8), "G’day ", ADVANCED, new String[]{"English", "Australia"}));
        return students;
    }

    static List<Student> greeting(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (MEN.equals(students.get(i).getGender())) {
                System.out.println("Студент: " + students.get(i).getName() + " " + students.get(i).getSurname() + " - " + "приветствие: " + students.get(i).getWelcome());
            } else {
                System.out.println("Студентка: " + students.get(i).getName() + " " + students.get(i).getSurname() + " - " + "приветствие: " + students.get(i).getWelcome());
            }
        }
        return students;
    }

    static List<Student> englishLevelList(List<Student> students) {
        final String reset = "\u001B[0m";
        final String red = "\u001B[31m";
        final String yellow = "\u001B[33m";
        final String green = "\u001B[32m";
        System.out.println(green + getLevelTitle(ADVANCED) + reset);
        students.stream().filter(s -> Objects.equals(s.getLevelEnglish(), ADVANCED))
                .sorted(new StudentComparator())
                .forEach(s -> System.out.println(s.getName() + " " + s.getSurname()));
        System.out.println(yellow + "Intermediate: " + reset);
        students.stream().filter(s -> Objects.equals(s.getLevelEnglish(), INTERMEDIATE))
                .sorted(new StudentComparator())
                .forEach(s -> System.out.println(s.getName() + " " + s.getSurname()));

        System.out.println(red + "Beginner: " + reset);
        students.stream().filter(s -> Objects.equals(s.getLevelEnglish(), BEGINNER))
                .sorted(new StudentComparator())
                .forEach(s -> System.out.println(s.getName() + " " + s.getSurname()));
        return students;
    }


    private static Map<LevelEnglish, List<Student>> levelEnglish(List<Student> students) {
        Map<LevelEnglish, List<Student>> levels = new HashMap();

        for (LevelEnglish key : LevelEnglish.values()) {
            levels.put(key, new ArrayList<>());
        }

        for (Student student : students) {
            levels.get(student.getLevelEnglish()).add(student);
        }

        return levels;
    }

    private static String getLevelTitle(LevelEnglish level) {
        return level.getDesc() + ": ";
    }

    static List<Student> duty(List<Student> students) {
        students.sort((x, y) -> y.getDateOfBirth().compareTo(x.getDateOfBirth()));

        System.out.println("Дежурный: " + students.get(0).getName() + " - " + students.get(0).getDateOfBirth());
        return students;
    }

    static class StudentComparator implements Comparator<Student> {

        public int compare(Student a, Student b) {

            return a.getName().compareTo(b.getName());
        }
    }

}
