package org.maks.newclass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String country;
    private String welcome;
    private LevelEnglish levelEnglish;
    private String[] languages; //Создаем массив строк для множества языков студента
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getWelcome() {
        return welcome;
    }

    public LevelEnglish getLevelEnglish() {
        return levelEnglish;
    }
    public String[] getLanguages() { return languages; }//Геттер для множества языков студента

    Student(String name, String surname, Gender gender, LocalDate dateOfBirth, String country, String welcome, LevelEnglish levelEnglish, String[] languages) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.welcome = welcome;
        this.levelEnglish = levelEnglish;
        this.languages = languages;
    }
}
