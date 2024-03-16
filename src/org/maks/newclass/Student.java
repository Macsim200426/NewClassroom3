package org.maks.newclass;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfBirth;
    private String country;
    private String welcome;
    private String levelEnglish;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public String getGender() {
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

    public String getLevelEnglish() {
        return levelEnglish;
    }

    Student(String name,String surname, String gender, LocalDate dateOfBirth, String country, String welcome, String levelEnglish) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.welcome = welcome;
        this.levelEnglish = levelEnglish;
    }
}
